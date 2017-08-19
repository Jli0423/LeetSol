class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        String ans = "";
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                words.add(s.substring(start, i));
                start = i + 1;
            }
            if(i == s.length() - 1){
                words.add(s.substring(s.lastIndexOf(" ") + 1));
            }
        }
        for(int i = 0; i < words.size(); i++){
            StringBuilder str = new StringBuilder(words.get(i)).reverse();
            if(i == 0){
                ans = str.toString() + ans;
            }else{
                ans = ans + " " + str;
            }
        }
        return ans;
    }
}
