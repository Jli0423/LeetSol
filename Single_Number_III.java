class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int[] arr = new int[2];
        int i = 0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            arr[i] = it.next();
            i++;
        }
        return arr;
    }
}
