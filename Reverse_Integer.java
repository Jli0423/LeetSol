// Current solution
class Solution {
    public int reverse(int x) {
        long ans = 0;
        int track = 1;
        while(x != 0){
            ans = ans* 10 + x%10;
            x = x/10;
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)ans;
    }
}

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

// EVEN SLOWER
class Solution {
    public int reverse(int x) {
        boolean check = false;
        if(x < 0){
            check = true;
            x = x*(-1);
        }
        double ans = 0;
        int length = String.valueOf(x).length() - 1;
        int digit = 1;
        for(int i = 0; i < 10; i++){
            ans = ans + (x%(10*digit))*Math.pow(10, length);
            x = (x - x%(10*digit))/10;
            length --;
            System.out.println(ans);
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        if(check){
            ans = ans*(-1);
        }
        return (int)ans;
    }
}