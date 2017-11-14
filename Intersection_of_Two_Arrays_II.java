class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length < 1){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                map.put(nums2[i], map.get(nums2[i]) + 1);
            }else{
                map.put(nums2[i], 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                ans.add(nums1[i]);
                if(map.get(nums1[i]) > 1){
                    map.put(nums1[i], map.get(nums1[i]) - 1);
                }else{
                    map.remove(nums1[i]);
                }
            }
        }
        int[] array = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            array[i] = ans.get(i);
        }
        return array;
    }
}