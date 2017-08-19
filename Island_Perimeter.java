class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[0].length; y++){
                if(grid[x][y] == 1){
                    count += 4;
                    if(y + 1 > grid[0].length - 1){
                    }
                    else if(grid[x][y+1] == 1){
                      count --;
                    }

                    if(y - 1 < 0){
                    }
                    else if(grid[x][y-1] == 1){
                      count --;
                    }

                    if(x + 1 > grid.length - 1){
                    }
                    else if(grid[x+1][y] == 1){
                      count --;
                    }
                    
                    if(x - 1 < 0){
                    }
                    else if(grid[x-1][y] == 1){
                      count --;
                    }
                }
            }
        }
        return count;
    }
}
