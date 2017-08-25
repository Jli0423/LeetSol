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
