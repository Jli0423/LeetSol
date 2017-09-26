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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return sum;
        }
        getLeft(root, false);
        return sum;
    }

    public void getLeft(TreeNode root, boolean left){
        if(root.left == null && root.right == null){
            if(left){
                sum += root.val;
            }
            return;
        }
        if(root.left != null){
            getLeft(root.left, true);
        }
        if(root.right != null){
            getLeft(root.right, false);
        }
    }
}
