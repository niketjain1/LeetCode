class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        int l = String.valueOf(low).length();
        int h = String.valueOf(high).length();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = l; i <= h; i++){    
            for(int j = 0; j < 10 - i; j++){
                int num = Integer.parseInt(digits.substring(j, j + i));
                if(num >= low && num <= high){
                    arr.add(num);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}