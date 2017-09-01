// First proper implementation of BTS (a lot of copy paste from solution)

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            double sum = 0;
            int count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode n = queue.remove();
                sum += n.val;
                count++;
                if(n.left != null){
                    temp.add(n.left);
                }
                if(n.right != null){
                    temp.add(n.right);
                }
            }
            queue = temp;
            ans.add(sum/count);
        }
        return ans;
    }
}
