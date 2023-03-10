class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int[] result = {-1, -1};
        if(n == 0){
            return result;
        }
        while(low < high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        if(nums[low] != target){
            return result;
        }
        result[0] = low;
        
            high = n;
            while(low < high){
                int mid = low + (high - low)/2;
                if(nums[mid] > target){
                    high = mid;
                }else {
                    low = mid + 1;
                }
            }
        result[1] = low - 1;
        return result;
    }
}