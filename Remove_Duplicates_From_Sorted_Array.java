// Slow ass solution: BOTTOM 0.1% OF TIME COMPLEXITY
class Solution {
    public int removeDuplicates(int[] nums) {
        Integer[] intVals = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> finalNums = new HashSet<>(Arrays.asList(intVals));
        List<Integer> finals = new ArrayList<>(finalNums);
        Collections.sort(finals);
        for(int i = 0; i < finals.size(); i++){
            nums[i] = finals.get(i);
            System.out.println(finals.get(i));
        }
        return finals.size();
    }
}

//Better Solution
class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 1;
        if(nums.length < 2){
            return nums.length;
        }
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i-1] != nums[i]){
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }
}
