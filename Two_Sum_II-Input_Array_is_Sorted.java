class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ansArr = new int[2];
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(ans.containsKey(numbers[i])){
                if(ans.get(numbers[i]) > i){
                    ansArr[1] = ans.get(numbers[i]) + 1;
                    ansArr[0] = i + 1;
                }else{
                    ansArr[0] = ans.get(numbers[i]) + 1;
                    ansArr[1] = i + 1;
                }
            }else{
                ans.put(target - numbers[i], i);
            }
        }
        return ansArr;
    }
}
