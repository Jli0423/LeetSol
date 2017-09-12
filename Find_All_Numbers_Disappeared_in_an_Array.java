class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(nums[Math.abs(val) - 1] > 0){
                nums[Math.abs(val) - 1] = -nums[Math.abs(val) - 1];
            }
        }
        for(int i = 1; i <= nums.length; i++){
            if(nums[i-1] > 0){
                list.add(i);
            }
        }
        return list;
    }
}
