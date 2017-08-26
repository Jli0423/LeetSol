// Working solution: NOT O(log(m+n))
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length];
        if(nums1.length == 0 && nums2.length == 0){
            return 0;
        }
        if(nums1.length != 0){
            System.arraycopy(nums1, 0, combined, 0, nums1.length);
        }
        if(nums2.length != 0){
            System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);
        }
        Arrays.sort(combined);
        if(combined.length%2 == 1){
            return combined[combined.length/2];
        }else{
            double ans = (combined[combined.length/2 - 1] + combined[combined.length/2]);
            ans = ans/2;
            return ans;
        }
    }
}