class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row=false;
        boolean col=false;
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<c;i++)
        {
            if(matrix[0][i]==0)
            {
                row=true;
                break;
            }
        }
        for(int i=0;i<r;i++)
        {
            if(matrix[i][0]==0)
            {
                col=true;
                break;
            }
        }

        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1;i<c;i++)
        {
            if(matrix[0][i]==0)
            {
                for(int j=1;j<r;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }

        for(int i=1;i<r;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=1;j<c;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }

        if(row)
        {
            for(int i=0;i<c;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(col)
        {
            for(int i=0;i<r;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}