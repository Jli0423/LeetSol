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
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        traverse(root);
        return list;
    }

    public void traverse(TreeNode root){
        list.add(root.val);
        if(root.left != null){
            traverse(root.left);
        }
        if(root.right != null){
            traverse(root.right);
        }
    }
}
