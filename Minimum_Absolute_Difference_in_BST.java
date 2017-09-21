/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // Treemap automatically sorts keys, so it saves time
class Solution {
    Map<Integer, Integer> map = new TreeMap<>();
    public int getMinimumDifference(TreeNode root) {
        getList(root);
        int count = 0, prevVal = 0, difference = 0;
        for(int key : map.keySet()){
            if(count == 0){
                prevVal = key;
            }
            else if(count == 1){
                difference = key - prevVal;
                prevVal = key;
            }else{
                if(key - prevVal < difference){
                    difference = key - prevVal;
                }
                prevVal = key;
            }
            count ++;
        }
        return difference;
    }

    public void getList(TreeNode root){
        map.put(root.val, root.val);
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left != null){
            getList(root.left);
        }
        if(root.right != null){
            getList(root.right);
        }
    }
}
