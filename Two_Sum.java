// Proper O(n) Solution: Using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ansArr = new int[2];
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(ans.containsKey(nums[i])){
                ansArr[0] = ans.get(nums[i]);
                ansArr[1] = i;
            }else{
                ans.put(target - nums[i], i);
            }
        }
        return ansArr;
    }
}

// Solution 2: slow
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int n = 0; n < nums.length; n++){
                if(n == i){
                    n++;
                }
                if(nums[n] == target - nums[i]){
                    ans[0] = i;
                    ans[1] = n;
                    break;
                }
            }
            if(ans[0] != ans[1]){
                break;
            }
        }
        return ans;
    }
}


// Solution 3: super slow lol
class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] ans = new int[2];
        for(int i = 0; i < num.size(); i++){
            Integer check = target - num.get(i);
            if(num.contains(check) && num.indexOf(check) != i){
                ans[0] = i;
                ans[1] = num.indexOf(check);
                break;
            }
        }
        return ans;
    }
}
