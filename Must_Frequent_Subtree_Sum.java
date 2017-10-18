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
    int maxFreq = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        subSummation(root, map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == maxFreq){
                list.add(entry.getKey());
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    private int subSummation(TreeNode root, Map<Integer, Integer> map){
        int val = root.val;
        if(root.left != null){
            val += subSummation(root.left, map);
        }

        if(root.right != null){
            val += subSummation(root.right, map);
        }
        if(map.containsKey(val)){
            map.put(val, map.get(val) + 1);
        }else{
            map.put(val, 1);
        }
        maxFreq = Math.max(maxFreq, map.get(val));
        return val;
    }
}
