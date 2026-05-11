class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suf=new int[nums.length];
        int m=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            m*=nums[i];
            suf[i]=m;
        }
        int pref=1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            res[i]=pref*suf[i+1];
            pref*=nums[i];
        }
        res[nums.length-1]=pref;
        return res;
    }
}