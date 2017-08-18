// Attempt of recursion
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int init = 0;
        row = rowCalc(init, rowIndex + 1, row);
        return row;
    }   
    
    public List<Integer> rowCalc(int currRow, int rowIndex, List<Integer> prevRow){
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < currRow; i++){
            if(i == currRow - 1 || i == 0){
                row.add(1);
            }else{
                row.add(prevRow.get(i) + prevRow.get(i - 1));
            }
        }
        if(currRow == rowIndex){
            return row;
        }
        return rowCalc(currRow + 1, rowIndex, row);
    }
}


// Attempted Solution - Problem: Integers cannot handle high value Factorials
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 0; i < rowIndex; i++){
            // Using Combinations formula
            int ans = (factorial(rowIndex))/((factorial(i + 1))*(factorial(rowIndex - (i + 1))));
            row.add(ans);
        }
        return row;
    }
    
    public int factorial(int i){
        int ans = 1;
        for(int n = i; n > 0; n--){
            ans *= n;
        }
        return ans;
    }
}

