// Explanation: Dump it in hash to only find unique candies, if amount is more than half than total then only return 1/2
// else return the length of the hash
class Solution {
    public int distributeCandies(int[] candies) {
        Integer[] intCandy = Arrays.stream(candies).boxed().toArray(Integer[]::new);
        Set<Integer> candy = new HashSet<>((Arrays.asList(intCandy)));
        if(candy.size() >= candies.length/2){
            return candies.length/2;
        }
        return candy.size();
    }
}
