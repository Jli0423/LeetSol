class Solution {
    public int hammingDistance(int x, int y) {
      int count = 0;
      String[] bitX = new String[999];
      String[] bitY = new String[999];
      //Forgot to reverse string while attempting this question, bit compares from right to left :\
      bitX = new StringBuilder((Integer.toBinaryString(x))).reverse().toString().split("");
      bitY = new StringBuilder((Integer.toBinaryString(y))).reverse().toString().split("");
      if(bitX.length < bitY.length){
          for(int i = 0; i < bitX.length; i++){
              int valueX = Integer.valueOf(bitX[i]);
              int valueY = Integer.valueOf(bitY[i]);
              if(valueX != valueY){
                  count ++;
              }
          }

          for(int i = bitX.length; i < bitY.length; i++){
              if(Integer.valueOf(bitY[i]) != 0){
                  count ++;
              }
          }
      }
      else{
          for(int i = 0; i < bitY.length; i++){
              int valueX = Integer.valueOf(bitX[i]);
              int valueY = Integer.valueOf(bitY[i]);
              if(valueX != valueY){
                  count ++;
              }
          }
          for(int i = bitY.length; i < bitX.length; i++){
              if(Integer.parseInt(bitX[i]) != 0){
                  count ++;
              }
          }
      }
      return count;
    }
}

// Cheap solution using bitwise compartor XOR and then counting all the 1's
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
