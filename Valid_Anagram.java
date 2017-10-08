class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] list = new int[26];
        for(int i = 0; i < s.length(); i++){
            list[(int)s.charAt(i) - 97]++;
        }
        for(int i = 0; i < t.length(); i++){
            list[(int)t.charAt(i) - 97]--;
        }

        for(int i = 0; i < list.length; i++){
            if(list[i] != 0){
                return false;
            }
        }
        return true;
    }
}
