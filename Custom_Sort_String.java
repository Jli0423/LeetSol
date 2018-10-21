class Solution {
    public String customSortString(String S, String T) {
        int[] TAscii = new int[T.length()];
        for(int i = 0; i < T.length(); i++) {
            if (!S.contains(Character.toString(T.charAt(i)))) {
                TAscii[i] = ((int) T.charAt(i));
            } else {
                TAscii[i] = S.indexOf(T.charAt(i));
            }
        }
        Arrays.sort(TAscii);
        T = "";
        for(int i = 0; i < TAscii.length; i++) {
            if (TAscii[i] > S.length()) {
                T += ((char) TAscii[i]);
            } else {
                // System.out.println(i);
                T += S.charAt(TAscii[i]);
            }
        }
        return T;
    }
}