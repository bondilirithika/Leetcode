class Solution {
    static int[][] dp;
    public int maxMoves(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        for(int[] a:dp)
        Arrays.fill(a,-1);
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            max=Math.max(max,solve(grid,i,0));
        }
        return max;
    }
    int solve(int[][] grid,int row,int col)
    {
        if(row<0 || row>=grid.length || col <0 || col>=grid[0].length)
        return 0;
        if(dp[row][col]!=-1)
        return dp[row][col];
        int op1=0,op2=0,op3=0;
        if(col+1<grid[0].length && row-1>=0 && grid[row-1][col+1] > grid[row][col])
        op1=1+solve(grid,row-1,col+1);
        if(col+1<grid[0].length && row>=0 &&grid[row][col+1] > grid[row][col])
        op2=1+solve(grid,row,col+1);
        if(col+1<grid[0].length && row+1<grid.length &&grid[row+1][col+1] > grid[row][col])
        op3=1+solve(grid,row+1,col+1);
        return dp[row][col]=Math.max(Math.max(op1,op2),op3);
    }
}