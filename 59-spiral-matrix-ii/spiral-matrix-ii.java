class Solution {
    public int[][] generateMatrix(int n) {
        int c=1;
        int[][] arr=new int[n][n];
        for(int layer=0;layer<(n+1)/2;layer++)
        {
            for(int j=layer;j<=n-1-layer;j++)
            {
                arr[layer][j]=c++;
            }
            for(int i=layer+1;i<=n-1-layer;i++)
            {
                arr[i][n-1-layer]=c++;
            }
            for(int j=n-2-layer;j>=layer;j--)
            {
                arr[n-1-layer][j]=c++;
            }
            for(int i=n-2-layer;i>=layer+1;i--)
            {
                arr[i][layer]=c++;
            }
        }
        return arr;
    }
}