class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int i=0;
        while(i<nums.length-1)
        {
            int cur=1;
            if(nums[i]<nums[i+1])
            {
                cur++;
                i++;
                while(i<nums.length-1 && nums[i]<nums[i+1])
                {
                    cur++;
                    i++;
                }
            }
            else if(nums[i]>nums[i+1])
            {
                cur++;i++;
                while(i<nums.length-1 && nums[i]>nums[i+1])
                {
                    cur++;i++;
                }
            }
            else
            i++;
            ans=Math.max(ans,cur);
        }
        return ans;
    }
}