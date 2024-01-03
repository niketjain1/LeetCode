class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 && m == 0) {
            return;
        }
        if (m == 0 && n == 1) {
            nums1[0] = nums2[0];
            return;
        }

        int i = m - 1, j =  n - 1;
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}