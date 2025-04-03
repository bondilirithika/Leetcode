class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row:matrix)
        {
            if(row[0]<=target)
            {
                if(row[matrix[0].length-1]>=target)
                {
                    for(int i:row)
                    {
                        if(i==target)
                        return true;
                    }
                }
                else
                continue;
            }
            else
            return false;
        }
        return false;
    }
}