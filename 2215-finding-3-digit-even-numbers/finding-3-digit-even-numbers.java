class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digitsCount = new int[10];
        for (int i = 0; i < digits.length; i++) {
            digitsCount[digits[i]]++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 100; i <= 999; i = i + 2) {
            int nums = i;
            int[] freq = new int[10];
            while (nums > 0) {
                int rem = nums % 10;
                freq[rem]++;
                nums = nums / 10;
            }
            boolean res = findAns(freq, digitsCount);
            if (res) {
                arr.add(i);
            }
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
    
    private boolean findAns(int[] currentNums, int[] digitsCount) {
        for (int i = 0; i < 10; i++) {
            if (currentNums[i] > digitsCount[i]) {
                return false;
            }
        }
        return true;
    }
}