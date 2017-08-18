public class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> list = new ArrayList<String>();
     for (int x = 1; x <= n; x++){
            String fizz = "Fizz";
            String buzz = "Buzz";
            String fb = "FizzBuzz";
            if (x%5==0 && x%3==0){
                list.add(fb);
            }
            else if (x%5 != 0 && x%3 == 0){
                list.add(fizz);
            }
            else if (x%5 == 0 && x%3 != 0){
                list.add(buzz);
            }
            else list.add(Integer.toString(x));
        }
    return list;
    }
}
