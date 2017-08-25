class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) != null && map.get(s.charAt(i)) >= index){
                index = map.get(s.charAt(i)) + 1;
            }
            else{
                max = Math.max(max, i - index + 1);
            }
            map.put(s.charAt(i), i);
        }
        return max;
    }
}