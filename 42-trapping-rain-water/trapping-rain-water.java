class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        //leftmax
        
        int lm=0;
        for(int i=0;i<height.length;i++)
        {
            if(lm<height[i])
            {
                lm=height[i];
            }
            leftmax[i]=lm;
        }
        int rm=0;
        for(int i=height.length-1;i>=0;i--)
        {
            if(rm<height[i])
            rm=height[i];
            
            rightmax[i]=rm;
        }
        int total=0;
        for(int i=0;i<height.length-1;i++)
        {
            if(height[i]<leftmax[i] && height[i]<rightmax[i])
            {
                total+=Math.min(leftmax[i],rightmax[i])-height[i];
            }
        }
        return total;
    }
}