class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int cursum=0;
        for(int i:nums)
        {
            cursum+=i;
            if(cursum>ans)
            ans=cursum;
            if(cursum<0)
            cursum=0;
        }
        return ans;
    }
}