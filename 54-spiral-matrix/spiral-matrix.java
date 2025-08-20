class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        //mark and do it
        int top=0,bottom=m.length-1,left=0,right=m[0].length-1;
        List<Integer> ans=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            //top right bottom left

            for(int i=left;i<=right;i++)
            {
                ans.add(m[top][i]);
                
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans.add(m[i][right]);
                
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                ans.add(m[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--)
            {
                ans.add(m[i][left]);
            }
            left++;
            }
        }
        return ans;
    }
}