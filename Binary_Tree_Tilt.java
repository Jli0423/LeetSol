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
    int ans = 0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return ans;
        }
        sum(root);
        return ans;
    }

    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);

        ans += Math.abs(left - right);

        return left + right + root.val;
    }
}
