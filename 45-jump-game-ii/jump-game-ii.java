class Solution {
    public int jump(int[] nums) {
        //interval that you can reach
        int maxreach=nums[0];
        int startindex=1;
        int jump=0;
        if(nums.length==1)
        return 0;
        while(maxreach<nums.length-1)
        {
            int locmax=maxreach;
            for(int i=startindex;i<=locmax;i++)
            {
                int reach=i+nums[i];
                maxreach=Math.max(maxreach,reach);
            }
            startindex=locmax+1;
            jump++;
        }
        return ++jump;
    }
}