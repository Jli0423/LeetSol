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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode sum = new TreeNode(0);
        if(t1 == null && t2 == null){
            return null;
        }
        else if(t1 == null){
            sum.val = t2.val;
            sum.left = mergeTrees(null, t2.left);
            sum.right = mergeTrees(null, t2.right);
        }
        else if(t2 == null){
            sum.val = t1.val;
            sum.left = mergeTrees(null, t1.left);
            sum.right = mergeTrees(null, t1.right);
        }
        else{
            sum.val = t1.val + t2.val;
            sum.left = mergeTrees(t1.left, t2.left);
            sum.right = mergeTrees(t1.right, t2.right);
        }
        return sum;
    }
}
