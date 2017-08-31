// Subsequence does not even matter here, baited
class Solution {
    public int findLUSlength(String a, String b) {
        int index = 0;
        if(a.equals(b)){
            return -1;
        }
        if(a.length() == 0 || a.length() < b.length()){
            return b.length();
        }
        else if(b.length() == 0 || b.length() < a.length()){
            return a.length();
        }
        else{
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    index = i;
                }
            }
        }
        return index + 1;
    }
}

// The for loop isn't even needed, bigger bait :\
class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        else{
            return Math.max(a.length(), b.length());
        }
    }
}
