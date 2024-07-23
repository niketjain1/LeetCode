class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List arr = new ArrayList<Boolean>();
        int maxCandy = candies[0];
        for (int i = 1; i < n; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }
        return arr;
    }
}