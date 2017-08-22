/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                index = i;
                break;
            }
        }
        System.out.println(max + " " + index);
        TreeNode ans = new TreeNode(max);
        ans.left = left(index, nums, ans.left);
        ans.right = right(index, nums, ans.left);
        return ans;
    }

    public TreeNode left(int index, int[] nums, TreeNode t){
        if(index < 0){
            return t;
        }
        t.val = nums[index];
        return left(index - 1, nums, t.left);
    }
    public TreeNode right(int index, int[] nums, TreeNode t){
        if(index > nums.length - 1){
            return t;
        }
        t.val = nums[index];
        return right(index + 1, nums, t.right);
    }
}
