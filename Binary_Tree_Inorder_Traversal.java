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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return ans;
        }
        traverse(root);
        return ans;
    }

    public void traverse(TreeNode root){
        if(root.left != null){
            traverse(root.left);
        }
        ans.add(root.val);
        if(root.right != null){
            traverse(root.right);
        }
    }
}
