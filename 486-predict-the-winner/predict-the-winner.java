class Solution {
    public boolean predictTheWinner(int[] nums) {
        int tot=0;
        for(int i:nums)
        tot+=i;

        int p1=solve(nums,0,nums.length-1,1);
        return p1>=tot-p1;

    }
    int solve(int[] nums,int l,int r,int turn)
    {
        if(l>r)
        return 0;

        if(turn==1)
        {
            return Math.max(nums[l]+solve(nums,l+1,r,2),nums[r]+solve(nums,l,r-1,2));
        }
        else
        return Math.min(solve(nums,l+1,r,1),solve(nums,l,r-1,1));
    }
}