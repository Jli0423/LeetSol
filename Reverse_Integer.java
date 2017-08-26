// Slow solution
class Solution {
    public int reverse(int x) {
        boolean val = true;
        String num = Integer.toString(x);
        if(x < 0){
            val = false;
            num = num.substring(1);
        }
        String numReverse = new StringBuilder(num).reverse().toString();
        long value = Long.parseLong(numReverse);
        if(!val){
            value = value * (-1);
        }
        if(value > Integer.MAX_VALUE || value < Integer.MIN_VALUE){
            return 0;
        }
        return (int) value;
    }
}