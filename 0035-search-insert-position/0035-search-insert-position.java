class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] < target){
                ans = mid + 1;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}