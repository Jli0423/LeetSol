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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1){
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        if(root == null){
            return null;
        }
        add(root, v, d, 1);
        return root;
    }

    public void add(TreeNode root, int v, int d, int initial){
        if(initial != d - 1){
            if(root.left != null){
                add(root.left, v, d, initial + 1);
            }
            if(root.right != null){
                add(root.right, v, d, initial + 1);
            }
        }else{
            System.out.println("Value: " + root.val);
            TreeNode temp = root.left;
            root.left = new TreeNode(v);
            root.left.left = temp;
            temp = root.right;
            root.right = new TreeNode(v);
            root.right.right = temp;
        }
    }
}
