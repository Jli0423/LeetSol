class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int n = 0; n < nums.length; n++){
                if(n == i){
                    n++;
                }
                if(nums[n] == target - nums[i]){
                    ans[0] = i;
                    ans[1] = n;
                    break;
                }
            }
            if(ans[0] != ans[1]){
                break;
            }
        }
        return ans;
    }
}
