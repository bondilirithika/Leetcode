class Solution {
    public int missingNumber(int[] nums) {
        int tsum=0;
        for(int i:nums)
        {
            tsum+=i;
        }
        int n=nums.length;
        int sum=n*(n+1)/2;
        return sum-tsum;
    }
}