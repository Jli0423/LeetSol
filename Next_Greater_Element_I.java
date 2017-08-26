class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.sort(nums2);
        Set<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            hash.add(nums2[i]);
        }
        List<Integer> list = new ArrayList<>(hash);
        for(int i = 0; i < nums1.length; i++){
            if(list.indexOf(nums1[i]) >= list.size() || list.indexOf(nums1[i]) < 0 || list.indexOf(nums1[i]) >= list.size()){
                ans[i] = -1;
            }
            else{
                ans[i] = list.get(list.indexOf(nums1[i]));
            }
        }
        return ans;
    }
}