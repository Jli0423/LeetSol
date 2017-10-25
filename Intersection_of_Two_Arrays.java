class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length < 1){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < Math.max(nums1.length, nums2.length); i++){
            if(i < nums1.length){
                set1.add(nums1[i]);
            }
            if(i < nums2.length){
                set2.add(nums2[i]);
            }
        }
        Integer[] array1 = set1.toArray(new Integer[set1.size()]);
        for(int i = 0; i < array1.length; i++){
            if(set2.contains(array1[i])){
                list.add(array1[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
