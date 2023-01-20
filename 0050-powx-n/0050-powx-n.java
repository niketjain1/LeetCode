class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nValue = n;
        if(nValue < 0){
            nValue = - nValue;
        }
        while(nValue > 0){
            if(nValue % 2 == 1){
                ans = ans * x;
                nValue = nValue - 1;
            }else{
                x = x * x;
                nValue = nValue/2;
            }
        }
        if(n< 0){
            ans = (double)1.0/(double)ans;
        }
        return ans;
    }
}