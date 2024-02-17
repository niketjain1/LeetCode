class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;

        HashSet set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1)) {
                continue;
            } else {
                int count = 1;
                int j = nums[i] + 1;
                while (set.contains(j)) {
                    count++;
                    j++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}