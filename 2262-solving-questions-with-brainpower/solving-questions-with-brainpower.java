class Solution {
    long dp[];
    public long mostPoints(int[][] questions) {
        dp = new long[questions.length];
        return dfs(questions, 0);
    }
    private long dfs(int[][] questions, int i) {
        if (i >= questions.length) {
            return 0;
        }
        if (dp[i] > 0) {
            return dp[i];
        }
        int points = questions[i][0], jump = questions[i][1];
        return dp[i] = Math.max(dfs(questions, i + 1), points + dfs(questions, i + jump + 1));
    }
}