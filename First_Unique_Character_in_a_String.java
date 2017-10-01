class Solution {
    public int firstUniqChar(String s) {
        if(s.length() < 1){
            return -1;
        }
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                ans = i;
                break;
            }
            if(i == s.length() - 1){
                return -1;
            }
        }
        return ans;
    }
}
