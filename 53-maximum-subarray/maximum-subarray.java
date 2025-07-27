class Solution {
    public int maxSubArray(int[] nums) {
        //KEDANES ALGO
        int maxsum=Integer.MIN_VALUE;
        int csum=0;
        for(int i:nums)
        {
            csum+=i;
            if(csum>maxsum)
            maxsum=csum;
            if(csum<0)
            csum=0;
        }
        return maxsum;
    }
}