public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max=counter;
        for (int x = 0; x <nums.length; x++){
            if (nums[x] == 1){
                counter ++;
                }
            if (max < counter){
                   max = counter;
                }
            else if (nums[x] !=1){
                counter = 0;
            }
        }
        return max;
    }
}
