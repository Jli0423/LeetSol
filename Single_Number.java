class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                ans -= nums[i];
            }else{
                set.add(nums[i]);
                ans += nums[i];
            }
        }
        return ans;
    }
}
