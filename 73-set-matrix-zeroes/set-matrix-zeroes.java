class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> col=new HashSet<>();
        HashSet<Integer> row=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    col.add(j);
                    row.add(i);
                }
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(row.contains(i))
                {
                    for(int k=0;k<matrix[0].length;k++)
                    {
                        matrix[i][k]=0;
                    }
                }
                if(col.contains(j))
                {
                    for(int k=0;k<matrix.length;k++)
                    {
                        matrix[k][j]=0;
                    }
                }
            }}

    }
}