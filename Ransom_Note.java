// put words in hashmap to have O(1) character checker
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() == 0 && ransomNote.length() > 0){
            return false;
        }
        if(ransomNote.length() == 0 || (ransomNote.length() == 0 && magazine.length() == 0)){
            return true;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }else{
                map.put(magazine.charAt(i), 1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) != 0){
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
