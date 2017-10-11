// Dynamic Programming, with discrete math
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1;
        }
        int ans = 9;
        int dp = 10;
        for(int i = 2; i <= n && i <= 10; i++){
            ans *= 9 - i + 2;
            dp += ans;
        }
        return dp;
    }
}
