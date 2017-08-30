// Attempt solution #1: starting from middle of array
class Solution {
    public int countSubstrings(String s) {
        return checkPal(s, s.length());
    }

    public int checkPal(String s, int ans){
        if(s.length() < 2){
            return ans;
        }
        if(s.length()%2 == 1){
            int i = s.length()/2 + 1;
            int j = i - 2;
            while(i < s.length() || j >= 0){
                if(s.charAt(i) == s.charAt(j)){
                    ans++;
                    i++;
                    j--;
                }else{
                    break;
                }
            }
         return checkPal(s.substring(0, s.length()/2 + 1), ans) + checkPal(s.substring(s.length()/2), ans);
        }else{
            int i = s.length()/2;
            int j = i - 1;
            while(i < s.length() || j >= 0){
                if(s.charAt(i) == s.charAt(j)){
                    ans++;
                    i++;
                    j--;
                }else{
                    break;
                }
            }
            return checkPal(s.substring(0, s.length()/2 - 1), ans) + checkPal(s.substring(s.length()/2), ans);
        }
    }
}

// Final solution: Starting from index 0 and traverse across entire String
class Solution {
    int total = 1;
    public int countSubstrings(String s) {
        if(s.length() == 0){
            return 0;
        }
        for(int i = 0; i < s.length() - 1; i++){
                checkPal(s, i, i);
                checkPal(s, i, i + 1);
        }
        return total;
    }

    public void checkPal(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
            total++;
        }
    }
}
