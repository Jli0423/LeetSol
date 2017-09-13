class Solution {
    public char findTheDifference(String s, String t) {
        int length = t.length();
        int ascii = 0;
        for(int i = 0; i < length; i++){
            if(i < s.length()){
                ascii -= (int) s.charAt(i);
            }
            ascii += (int) t.charAt(i);
        }
        return (char) ascii;
    }
}
