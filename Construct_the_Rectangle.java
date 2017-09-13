class Solution {
    public int[] constructRectangle(int area) {
        int div, diff;
        int[] ans = new int[2];
        diff = area;
        for(int i = 1; i <= area; i++){
            div = area/i;
            if(div*i == area && Math.abs(i - div) < diff){
                ans[0] = div;
                ans[1] = i;
                diff = Math.abs(i - div);
            }
        }
        return ans;
    }
}
