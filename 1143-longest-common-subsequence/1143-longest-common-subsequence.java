class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1 + 1][l2 + 1];
        for(int i = 0; i <= l1; i++){
            Arrays.fill(dp[i], -1);
        }
        return lcs(text1, text2, dp, l1 - 1, l2 - 1);
    }
    public int lcs(String A, String B, int[][] dp , int n, int m){
        if(n == -1 || m == -1){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(A.charAt(n) == B.charAt(m)){
            dp[n][m] = 1 + lcs(A, B, dp, n - 1, m - 1);
        }else{
            dp[n][m] = Math.max(lcs(A, B, dp, n - 1, m), lcs(A, B, dp, n, m - 1));
        }
        return dp[n][m];
    }
}