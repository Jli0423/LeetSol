class Solution {
    public int longestPalindrome(String s) {
        if(s.length() < 2){
            return s.length();
        }
        int[] lower = new int[26];
        int[] upper = new int[26];
        for(int i = 0; i < s.length(); i++){
            int ascii = (int) s.charAt(i);
            if(ascii > 96){
                ascii -= 97;
                lower[ascii]++;
            }else{
                ascii -= 65;
                upper[ascii]++;
            }
        }
        int ans = 0;
        boolean check = false;
        for(int i = 0; i < 26; i++){
            if(!check && lower[i] % 2 == 1){
                check = true;
                ans += lower[i];
            }
            else if(check && lower[i] % 2 == 1){
                ans += lower[i] - 1;
            }
            if(!check && upper[i] % 2 == 1){
                check = true;
                ans += upper[i];
            }
            else if(check && upper[i] % 2 == 1){
                ans += upper[i] - 1;
            }
            if(lower[i] % 2 == 0){
                ans += lower[i];
            }
            if(upper[i] % 2 == 0){
                ans += upper[i];
            }
        }
        return ans;
    }
}
