// WIP 
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[1] = Arrays.binarySearch(nums, target);
        if(ans[1] < 0){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int[] newNum = new int[ans[1] - 1];
        for(int i = 0; i < ans[0] - 1; i++){
            newNum[i] = nums[i];
            System.out.println(nums[i] + ": " + newNum[i]);
        }
        ans[0] = Arrays.binarySearch(newNum, target);
        if(ans[0] < 0){
            ans[0] = ans[1];
        }
        return ans;
    }
}
