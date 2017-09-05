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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tempL = root.left;
        TreeNode tempR = root.right;
        TreeNode n = root;
        n.left = tempR;
        n.right = tempL;
        if(root.left != null){
            n.left = invertTree(root.left);
        }
        if(root.right != null){
            n.right = invertTree(root.right);
        }
        return n;
    }
}
