class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean status = false;
        if(nums.length < 3){
            return nums.length;
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ans.add(nums[i]);
            }
            else if(ans.contains(nums[i]) && status == false && nums[i] == nums[i-1]){
                ans.add(nums[i]);
                status = true;
            }
            else if(nums[i] != nums[i-1]){
                status = false;
                ans.add(nums[i]);
            }
            else if(!status){
                ans.add(nums[i]);
            }
        }

        for(int i = 0; i < ans.size(); i++){
            nums[i] = ans.get(i);
        }
        return ans.size();
    }
}
