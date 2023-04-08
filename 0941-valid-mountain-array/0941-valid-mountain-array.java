class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean left = false;
        int n = arr.length;
        int i = 0, j = n - 1;
        if(n < 3){
            return false;
        }
        while(i + 1 < n){
            if(arr[i] < arr[i + 1]){
                i++;
            }else{
                break;
            }
        }
        // System.out.print(i);
        while(j - 1 > 0){
            if(arr[j] < arr[j - 1]){
                j--;
            }else{
                break;
            }
        }
        if(i == n - 1 || j == 0){
            return false;
        }
        return i == j;
    }
}