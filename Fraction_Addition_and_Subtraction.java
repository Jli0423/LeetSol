// Attempt 2:


// Attempt 1(Unfinished): Code became too inefficient, did not finish
class Solution {
    public String fractionAddition(String expression) {
        List<Integer> index = new ArrayList<>();
        int numerator = 0;
        boolean firstNegative = false;
        int denominator = 1;
        if(expression.charAt(0) == '-'){
            firstNegative = true;
        }
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) == '/'){
                index.add(i);
            }
        }
        for(int i = 0; i < index.size(); i++){
            // denominator *= Character.getNumericValue(expression.charAt(index.get(i) + 1));
            denominator *= getVal(expression, index.get(i) + 1, expression.length(), 1);
            System.out.println(denominator);
        }
        for(int i = 0; i < index.size(); i++){
            int multiply = denominator/Character.getNumericValue(expression.charAt(index.get(i) + 1));
            if(i == 0 && firstNegative || (i != 0 && expression.charAt(index.get(i) - 2) == '-')){
                numerator -= multiply*Character.getNumericValue(expression.charAt(index.get(i) - 1));
            }else{
                numerator += multiply*Character.getNumericValue(expression.charAt(index.get(i) - 1));
            }
        }
        if(numerator == 0){
            denominator = 1;
        }
        // int gcd = gcdCalc(denominator, numerator);
        int gcd = 1;
        String ans = numerator/gcd + "/" + denominator/gcd;
        return ans;
    }

    private int getVal(String expression, int currIndex, int toIndex, int increment){
        int val = 0;
        int initial = currIndex;
        while(currIndex != toIndex){
            if(expression.charAt(currIndex) == '+' || expression.charAt(currIndex) == '-'){
                if(increment > 0){
                    val = Integer.parseInt(expression.substring(initial, currIndex));
                }else{
                    val = Integer.parseInt(expression.substring(currIndex, initial));
                }
                break;
            }
            currIndex += increment;
        }
        return val;
    }

    private int gcdCalc(int a, int b){
        int gcd = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        for(int i = 1; i <= Math.min(a, b); i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;

    }
}
