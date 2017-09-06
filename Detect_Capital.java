class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < word.length(); i++){
            if((int)word.charAt(i) < 92){
                upper++;
            }
        }
        if(upper > 1 && upper < word.length()){
            return false;
        }
        if(upper == 1 && (int)word.charAt(0) < 92 || upper == 0 || upper == word.length()){
            return true;
        }else{
            return false;
        }
    }
}
