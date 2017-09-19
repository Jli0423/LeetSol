class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        // puts every element in nums into hashmap with val = frequency
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // create arraylists of each element, and index of each list as frequencies
        for(int i : map.keySet()){
            int freq = map.get(i);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(i);
        }

        List<Integer> ans = new ArrayList<>();
        // since arraylist of frequencies - higher the better, go from highest frequency of index -> 0
        for(int i = bucket.length - 1; i >= 0; i--){
            if(ans.size() >= k){
                break;
            }
            else if(bucket[i] != null){
                ans.addAll(bucket[i]);
            }
        }
        return ans;
    }
}
