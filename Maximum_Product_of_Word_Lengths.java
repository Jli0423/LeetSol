// Attempt 1: Unfortunately didn't consider the fact that ab*cd would be larger than abc*d

class Solution {
    public int maxProduct(String[] words) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> check1 = new HashSet<>();
        HashSet<Character> check2 = new HashSet<>();
        int length1 = 0;
        int length2 = 0;
        for(int i = 0; i < words.length; i++){
            check1 = wordCheck(set1, words[i]);
            check2 = wordCheck(set2, words[i]);
            HashSet<Character> temp = new HashSet<>();
            if(words[i].length() > length1 && length1 <= length2 && check2 != null){
                set1 = wordCheck(temp, words[i]);
                length1 = words[i].length();
            }
            else if(words[i].length() > length2 && length2 < length1 && check1 != null && check1 != set1){
                set2 = wordCheck(temp, words[i]);
                length2 = words[i].length();
            }
        }
        return length1 * length2;
    }

    private HashSet<Character> wordCheck(HashSet<Character> set, String word){
        HashSet<Character> newSet = new HashSet<>();
        for(int i = 0; i < word.length(); i++){
            if(set.contains(word.charAt(i))){
                return null;
            }
            newSet.add(word.charAt(i));
        }
        return newSet;
    }
}
