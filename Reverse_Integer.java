class Solution {
    public int reverse(int x) {
        boolean val = true;
        String num = Integer.toString(x);
        if(x < 0){
            val = false;
            num = num.substring(1);
        }
        String numReverse = new StringBuilder(num).reverse().toString();
        long value = Integer.parseInt(numReverse);
        if(!val){
            value = value * (-1);
        }
        if(value != (int)value){
            return 0;
        }
        return (int) value;
    }
}
