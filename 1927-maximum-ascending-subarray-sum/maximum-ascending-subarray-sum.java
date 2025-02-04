class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int i=0;
        if(nums.length==1)
        return nums[0];
        while(i<nums.length-1)
        {
            int cur=nums[i];
            if(i<nums.length-1 && nums[i]<nums[i+1])
            {
                cur+=nums[++i];
            while(i<nums.length-1 && nums[i]<nums[i+1])
            {
                cur+=nums[i+1];
                i++;
            }
            }
            i++;
            sum=Math.max(sum,cur);
        }
        return sum;
        
    }
}