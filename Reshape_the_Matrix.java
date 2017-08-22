class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        System.out.println(nums.length + " " + nums[0].length);
        if (nums.length*nums[0].length != r*c){
            return nums;
        }
        if(nums.length == r && nums[0].length == c){
            return nums;
        }
        int[][] ans = new int[r][c];
        int row = 0;
        int col = 0;
        for(int x = 0; x < nums.length; x++){
            for(int y = 0; y < nums[0].length; y++){
                ans[row][col] = nums[x][y];
                if(row + 1 == r && col + 1 == c){
                    return ans;
                }
                if(col + 1 == c){
                    col = 0;
                    row++;
                }
                else{
                    col++;
                }
            }
        }
        return ans;
    }
}
