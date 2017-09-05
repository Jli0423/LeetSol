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
    HashSet<Integer> set = new HashSet<>();
    boolean ans = false;
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return ans;
        }
        if(set.contains(k - root.val)){
            ans = true;
        }else{
            set.add(root.val);
        }
        if(root.left != null){
            ans = findTarget(root.left, k);
        }
        if(root.right != null){
            ans = findTarget(root.right, k);
        }
        return ans;
    }
}
