// Not really a coding question, pure math
class Solution {
    public int titleToNumber(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++){
            total *= 26;
            total += s.charAt(i) - 64;
        }
        return total;
    }
}
