class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        //top left bottom righ
        int top=0,left=0,right=mat[0].length-1,bottom=mat.length-1;
        List<Integer> ans=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans.add(mat[i][right]);
            }
            right--;
            if(top<=bottom && left<=right)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}