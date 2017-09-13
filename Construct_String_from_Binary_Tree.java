// Not even sure why this is so slow
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
    String ans = "";
    public String tree2str(TreeNode t) {
        if(t == null){
            return ans;
        }
        if(ans == ""){
            ans += t.val;
        }else{
            ans += "(" + t.val;
        }
        if(t.left != null){
            tree2str(t.left);
            ans += ")";
        }
        else if(t.right != null){
            ans += "()";
        }
        if(t.right != null){
            tree2str(t.right);
            ans += ")";
        }
        return ans;
    }
}
