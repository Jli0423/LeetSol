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
    int depth, value = 0;
    public int findBottomLeftValue(TreeNode root) {
        getVal(root, 1);
        return value;
    }

    public void getVal(TreeNode root, int level){
        if(depth < level){
            depth = level;
            value = root.val;
        }
        if(root.left != null){
            getVal(root.left, level + 1);
        }
        if(root.right != null){
            getVal(root.right, level + 1);
        }
    }
}
