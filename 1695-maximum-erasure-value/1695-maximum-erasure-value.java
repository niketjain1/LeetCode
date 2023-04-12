class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = 0;
        Set<Integer> set = new HashSet<>();
        int sum = 0, ans = 0;
        while(start < n && end < n){
            if(!set.contains(nums[end])){
                sum += nums[end];
                ans = Math.max(sum, ans);
                set.add(nums[end]);
                end++;
            }else{
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
        }
        return ans;
    }
}