class Solution {
   // int count;
     int[][][] dp;
    int mod;
    public int knightDialer(int n) {
        int ans = 0;
        mod = 1000000007;
        dp = new int[4][3][n];
        for (int[][] a : dp)
            for (int[] k : a)
                Arrays.fill(k, -1);
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3;j++) {
                if ((i == 3 && j == 0) || (i == 3 && j == 2)) continue;
                ans = (ans + solve(i, j, n - 1)) % mod;
            }
        }
        return ans % mod;
    }

    int solve(int i, int j, int n) {
        if (i<0||i>3||j<0||j>2) return 0;
        if ((i==3 && j==0) || (i==3 && j==2)) return 0;
        if (n==0) return 1;
        
        if (dp[i][j][n] != -1) return dp[i][j][n];

        int no = 0;
        no = (no+solve(i-2, j + 1, n - 1) % mod) % mod;
        no = (no+solve(i-2, j - 1, n - 1) % mod) % mod;
        no = (no+solve(i-1, j + 2, n - 1) % mod) % mod;
        no = (no+solve(i+1, j + 2, n - 1) % mod) % mod;
        no = (no+solve(i-1, j - 2, n - 1) % mod) % mod;
        no = (no+solve(i+1, j - 2, n - 1) % mod) % mod;
        no = (no+solve(i+2, j + 1, n - 1) % mod) % mod;
        no = (no+solve(i+2, j - 1, n - 1) % mod) % mod;
        
        return dp[i][j][n] = no;
    }
}
