// Dumb Way becaus using ~num didnt' work
class Solution {
    public int findComplement(int num) {
        String bit = Integer.toString(num, 2);
        char[] bits = bit.toCharArray();
        for(int i = 0; i < bits.length; i++){
            if(bits[i] == '0'){
                bits[i] = '1';
            }else{
                bits[i] = '0';
            }
        }
        bit = String.valueOf(bits);
        int value = Integer.parseInt(bit, 2);
        return value;
    }
}
