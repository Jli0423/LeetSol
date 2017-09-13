// Attempt 1: Should work but O(n^2) takes too long
class Solution {
    public void moveZeroes(int[] nums) {
        int index = nums.length;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i; j < nums.length - 1; i++){
                if(nums[j] == 0){
                    int temp = nums[j + 1];
                    nums[j + 1] = 0;
                    nums[j] = temp;
                }
            }
        }
    }
}

// Attempt 2: Just shift any non zero val to the index, and incrementing index valclass Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[index] = temp;
                index++;
            }
        }
    }
}
