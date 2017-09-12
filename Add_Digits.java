// Pure math, to find the given solution, mod the value by 9
class Solution {
    public int addDigits(int num) {
        if(num < 10 && num != 9){
            return num;
        }
        else if(num%9 == 0){
            return 9;
        }
        else{
            return num%9;
        }
    }
}
