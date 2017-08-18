class Solution {
    public boolean judgeCircle(String moves) {
        int horz = 0;
        int vert = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                vert++;
            }
            if(moves.charAt(i) == 'D'){
                vert--;
            }
            if(moves.charAt(i) == 'R'){
                horz ++;
            }
            if(moves.charAt(i) == 'L'){
                horz --;
            }
        }
        if(horz == 0 && vert == 0){
            return true;
        }else{
            return false;
        }
    }
}