class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<pair> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    arr.add(new pair(i,j));
                }
            }
        }

        for(pair p:arr)
        {
            int row=p.r;
            int col=p.c;
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[row][i]=0;
            }
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][col]=0;
            }
        }
    }
}
class pair
{
    int r,c;
    pair(int r,int c)
    {
        this.r=r;
        this.c=c;
    }
}