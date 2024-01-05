class Solution {
    public void reverse(int nums[], int i, int j){
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        if (k < 0) {
            k = nums.length - k;
        }
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}