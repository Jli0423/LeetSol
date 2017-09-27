class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            stack.push(i);
        }

        for(int i = n - 1; i >= 0; i--){
            res[i] = -1;
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[i] = nums[stack.peek()];
            }
            stack.push(i);
        }
        return res;
    }
}
