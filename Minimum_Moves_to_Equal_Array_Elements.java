// Another pure math question: sum(array) - (array length)*(minimum value)
class Solution {
    public int minMoves(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        int min = nums[0];
        int total = nums[0];
        for(int i = 1; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            total += nums[i];
        }
        return total - nums.length*min;
    }
}
