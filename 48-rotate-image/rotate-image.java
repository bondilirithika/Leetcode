class Solution {
    public void rotate(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[j][i]=m[i][j];
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                m[j][c-i-1]=arr[j][i];
            }
        }
    }
}