class Solution {

    private int[] nums;

    public Solution(int[] nums) {
        nums = this.nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null){
            return null;
        }
        int rand = 0;
        int[] shuffled = new int[nums.length];
        for(int i = 0; i < shuffled.length; i++){
            System.out.println(shuffled[i]);
            rand = (int)(Math.random() * (i + 1));
            shuffled[i] = nums[rand];
            shuffled[rand] = nums[i];
        }
        return shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
