// Question is pretty dumb, as long as divisor is super small it will work, hence just bracket 2nd number -> last number
class Solution {
    public String optimalDivision(int[] nums) {
        if(nums.length == 1){
            return Integer.toString(nums[0]);
        }
        else if(nums.length == 2){
            return nums[0] + "/" + nums[1];
        }
        else{
            String ans = nums[0] + "/(";
            for(int i = 1; i < nums.length; i++){
                if(i == nums.length - 1){
                    ans = ans + nums[i];
                }else{
                    ans = ans + nums[i] + "/";
                }
            }
            ans = ans + ")";
            return ans;
        }
    }
}
