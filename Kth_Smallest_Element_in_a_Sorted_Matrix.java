class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int m = 0; m < matrix.length; m++){
            for(int n = 0; n < matrix[0].length; n++){
                if(!map.containsKey(matrix[m][n])){
                    map.put(matrix[m][n], 1);
                }else{
                    map.put(matrix[m][n], map.get(matrix[m][n]) + 1);
                }
            }
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                count++;
                if(count == k){
                    ans = entry.getKey();
                    break;
                }
            }
        }
        return ans;
    }
}
