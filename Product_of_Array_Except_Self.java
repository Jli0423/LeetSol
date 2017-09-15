// Explanation: First loop adds every val previous to the current index
// while the second loop adds every val after the current index, this forms the answer
// of multiplying every val except self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int preval = 1;
        int postval = 1;
        int[] res = new int[nums.length];
        res[0] = preval;
        for(int i = 1; i < nums.length; i++){
            res[i] = preval * nums[i - 1];
            preval *= nums[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            res[i] *= postval * nums[i + 1];
            postval *= nums[i + 1];
        }
        return res;
    }
}
