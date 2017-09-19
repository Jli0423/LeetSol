// Pretty much just find minimum row and * minimum column
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0){
            return m*n;
        }
        int row = ops[0][0];
        int col = ops[0][1];
        for(int i = 1; i < ops.length; i++){
            if(ops[i][0] < row){
                row = ops[i][0];
            }

            if(ops[i][1] < col){
                col = ops[i][1];
            }
        }
        return row*col;
    }
}
