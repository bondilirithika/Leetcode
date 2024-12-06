class Solution {
    public int maxSubArray(int[] nums) {
        int count=0;
        for(int i:nums)
        {
            if(i<0)
            {
                count++;
            }
        }
        if(count==nums.length)
        {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        else
        {
            int csum=0;
            int max=0;
            for(int i=0;i<nums.length;i++)
            {
                csum+=nums[i];
                if(csum<0)
                csum=0;

                max=Math.max(max,csum);
            }
            return max;
        }
    }
}