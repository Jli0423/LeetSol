class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        if(nums.length < 1){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
        }
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            int val = Integer.parseInt((me.getValue()).toString());
            if(val > nums.length/2){
                ans = Integer.parseInt((me.getKey()).toString());
                break;
            }
        }
        return ans;
    }
}
