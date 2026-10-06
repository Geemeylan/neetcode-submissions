class Solution {
    public int uniquePaths(int m, int n) {
        
        long[][] dp = new long[m + 1][n + 1];

        for (int r = 1; r <= m; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == 1 && c == 1) dp[r][c] = 1;
                else dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
            }
        }

        return (int) dp[m][n];
    }
}
