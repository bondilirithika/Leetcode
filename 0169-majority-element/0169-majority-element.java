class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int num=nums[0];
        for(int i:nums)
        {
            if(count==0)
            {
                num=i;
            }
            if(i==num)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return num;
    }
}