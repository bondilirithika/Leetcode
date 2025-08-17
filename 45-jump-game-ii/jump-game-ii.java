class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
        return 0;
        int maxreach=nums[0];
        int stind=1;
        int ju=0;
        while(maxreach<nums.length-1)
        {
            int locmax=maxreach;
            for(int i=stind;i<=locmax;i++)
            {
                maxreach=Math.max(maxreach,i+nums[i]);
            }
            stind=locmax+1;
            ju++;
        }
        return ju+1;
    }
}