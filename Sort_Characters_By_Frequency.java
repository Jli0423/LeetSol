// Attempt 1: Way to fucking slow
class Solution {
    public String frequencySort(String s) {
        if(s.length < 3){
            return s;
        }
        String ans = "";
        TreeMap<Character, Integer> map = new TreeMap<>();
        List<Character> letters = new ArrayList<>();
        List<Integer> amount = new ArrayList<>();
        int letterCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
                letterCount++;
            }
        }
        int cur = 0;
        char letter = '.';
        for(int n = 0; n < letterCount; n++){
            Set set = map.entrySet();
            Iterator i = set.iterator();
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                if((int) me.getValue() > cur){
                    cur = (int) me.getValue();
                    letter = (char) me.getKey();
                }
            }
            letters.add(letter);
            amount.add(cur);
            map.remove(letter);
            cur = 0;
            letter = '.';
        }
        for(int r = 0; r < letterCount; r++){
            for(int n = 0; n < amount.get(r); n++){
                ans += letters.get(r);
            }
        }
        return ans;
    }
}
