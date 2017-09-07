class Solution {
    int count = 0;
    public int countArrangement(int N) {
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }
        permutations(0, arr);
        return count;
    }
    
    public void permutations(int start, int[] arr){
        if(start == arr.length){
            count++;
        }
        for(int i = start; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
            if(arr[start] % (start + 1) == 0 || (start + 1) % arr[start] == 0){
               permutations(start + 1, arr);
            }
            int temp2 = arr[i];
            arr[i] = arr[start];
            arr[start] = temp2;
        }
    }
}
