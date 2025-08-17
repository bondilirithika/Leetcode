class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int far=i+nums[0];
        while(far<nums.length-1)
        {
            int k=far;
            for(int j=i+1;j<=far;j++)
            {
                int cfar=j+nums[j];
                far=Math.max(far,cfar);
                i=j;
                if(far>=nums.length-1)
                return true;
            }
            if(k==far)
            return false;
        }
        return true;
    }
}