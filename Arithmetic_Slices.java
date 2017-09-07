class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3){
            return 0;
        }
        int count = 0;
        int difference = A[1] - A[0];
        int amount = 1;
        for(int i = 0; i < A.length - 1; i++){
          // Must be amount - 2, if there are 4 consecutives, then there's 123(which should be covered by previous count), 234, 1234
            if(amount > 2){
                count = count + (amount - 2);
            }
            if(A[i + 1] - A[i] == difference){
                amount++;
            }else{
              // say if it's 123789, 7 -> 8 would set difference again, and amount to 2 so that 8 -> 9 can be at amount of 3
                amount = 2;
                difference = A[i + 1] - A[i];
            }
        }
        // Since we do not reach final number, as in, we stop at A.length - 1, we have to check it one last time
        if(amount > 2){
            count = count + (amount - 2);
        }
        return count;
    }
}
