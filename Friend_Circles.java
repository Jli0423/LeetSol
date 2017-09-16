class Solution {
    public int findCircleNum(int[][] M) {
        boolean[] checked = new boolean[M.length];
        int count = 0;
        for(int i = 0; i < M.length; i++){
            if(!checked[i]){
                checked = search(M, checked, i);
                count++;
            }
        }
        return count;
    }

    public boolean[] search(int[][] M, boolean[] checked, int i){
        for(int j = 0; j < M.length; j++){
            if(M[i][j] == 1 && !checked[j]){
                checked[j] = true;
                checked = search(M, checked, j);
            }
        }
        return checked;
    }
}
