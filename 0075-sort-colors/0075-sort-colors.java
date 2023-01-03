class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] == 0){
                countZero++;
            }else if(nums[i] == 1){
                countOne++;
            }else{
                countTwo++;
            }
        }
        // System.out.println(countZero +" "+ countOne +" "+ countTwo);
        int i = 0; 
        int k = 0;
        while (countZero > 0) {
            nums[k++] = 0;
            countZero--;
        }
        while (countOne > 0) {
            nums[k++] = 1;
            countOne--;
        }
        while (countTwo > 0) {
            nums[k++] = 2;
            countTwo--;
        }       
    }
}