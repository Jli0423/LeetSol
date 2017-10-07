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
    boolean check = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        checker(p, q);
        return check;
    }

    public void checker(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return;
        }
        else if (p == null || q == null){
            check = false;
            return;
        }else{
            if(p.val != q.val){
                check = false;
                return;
            }else{
                checker(p.left, q.left);
                checker(p.right, q.right);
            }
        }
    }
}
