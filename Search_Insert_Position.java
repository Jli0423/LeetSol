class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        List<Integer> ans = Arrays.stream(nums).boxed().collect(Collectors.toList());
        ans.add(target);
        Collections.sort(ans);
        return ans.indexOf(target);
    }
}
