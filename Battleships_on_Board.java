//Much faster solution: By defining the pieces that are either top, or left as the main piece, all that's needed is to check if another piece has a top or left piece
class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
              // if it's not top left piece, and left and top piece are either null or '.'
                if(board[x][y] == 'X' && (y == 0 || board[x][y-1] == '.') && (x == 0 || board[x - 1][y] == '.'))
                   count++;
            }
        }
        return count;
    }
}

// Long solution
class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        int[][] empty = new int[board.length][board[0].length];
        for(int x = 0; x < empty.length; x++){
            for(int y = 0; y < empty[0].length; y++){
                if(board[x][y] == 'X' && empty[x][y] == 0){
                    empty[x][y] = 1;
                    count ++;
                    for(int checkX = x; checkX >= 0; checkX--){
                        if(board[checkX][y] == '.'){
                            break;
                        }
                        empty[checkX][y] = 1;
                    }
                    for(int checkX = x; checkX < empty.length; checkX++){
                        if(board[checkX][y] == '.'){
                            break;
                        }
                        empty[checkX][y] = 1;
                    }
                      for(int checkY = y; checkY >= 0; checkY--){
                        if(board[x][checkY] == '.'){
                            break;
                        }
                        empty[x][checkY] = 1;
                    }
                    for(int checkY = y; checkY < empty[0].length; checkY++){
                        if(board[x][checkY] == '.'){
                            break;
                        }
                        empty[x][checkY] = 1;
                    }
                }
            }
        }
        return count;
    }
}
