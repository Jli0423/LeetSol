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
        if(nums.length == 0){
            return null;
        }
        return construct(nums, 0, nums.length - 1);
    }
    public TreeNode construct(int[] nums, int startTrack, int endTrack){
        if(startTrack > endTrack){
            return null;
        }
        int maxIndex = startTrack;
        for(int i = maxIndex; i <= endTrack; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }   
        TreeNode ans = new TreeNode(nums[maxIndex]);
        
        ans.left = construct(nums, startTrack, maxIndex - 1);
        ans.right = construct(nums, maxIndex + 1, endTrack);
        return ans;
    }
}
