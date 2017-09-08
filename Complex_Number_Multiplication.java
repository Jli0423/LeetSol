class Solution {
  // Pretty much hardcode :D
    public String complexNumberMultiply(String a, String b) {
        int imA = Integer.parseInt(a.substring(a.indexOf('+') + 1, a.indexOf('i')));
        int imB = Integer.parseInt(b.substring(b.indexOf('+') + 1, b.indexOf('i')));
        int reA = Integer.parseInt(a.substring(0, a.indexOf('+')));
        int reB = Integer.parseInt(b.substring(0, b.indexOf('+')));
        int real = reA*reB - imA*imB;
        int im = reA*imB + imA*reB;
        return "" + real + "+" + im + "i";
    }
}
