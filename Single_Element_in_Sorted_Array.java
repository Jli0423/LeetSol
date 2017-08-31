// Attempt 1: Super slow
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int val = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 1){
                set.add(nums[i]);
            }
            else if(!set.contains(nums[i])){
                val = nums[i];
            }
        }
        return val;
    }
}
