class Solution {
    int[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length][nums.length];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        return longincrsub(nums,0,-1);
    }
    int longincrsub(int[] nums,int i,int prev)
    {
        if(i>=nums.length)
        return 0;
        //2options
        int take=0,leave=0;
        if(prev==-1)
        {
            take=1+longincrsub(nums,i+1,i);
            leave=longincrsub(nums,i+1,prev);
            return Math.max(take,leave);
        }else{
        if(dp[i][prev]!=-1)
        return dp[i][prev];
        if(nums[i]>nums[prev])
        {
            take=1+longincrsub(nums,i+1,i);
        }
        
         leave=longincrsub(nums,i+1,prev);
        return dp[i][prev]=Math.max(take,leave);
        }
    }
}