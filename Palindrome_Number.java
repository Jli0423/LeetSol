class Solution {
    public boolean isPalindrome(int x) {
        String ans = Integer.toString(x);
        if(ans.length() < 2){
            return true;
        }
        ans = new StringBuilder(ans).reverse().toString();
        if(Objects.equals(Integer.toString(x), ans)){
            return true;
        }
        return false;
    }
}


// Solution 2: pointing to middle of array
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        if(s.length()%2 == 1){
            int i = s.length()/2 + 1;
            int j = i - 2;
            while(i < s.length() || j >= 0){
                if(s.charAt(i) == s.charAt(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }else{
            int i = s.length()/2;
            int j = i - 1;
            while(i < s.length() || j >= 0){
                if(s.charAt(i) == s.charAt(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
