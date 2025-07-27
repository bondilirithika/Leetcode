class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref=new int[nums.length];
        int[] suf=new int[nums.length];
        //pref
        int cpro=1;
        for(int i=0;i<nums.length;i++)
        {
            cpro*=nums[i];
            pref[i]=cpro;
        }
        cpro=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            cpro*=nums[i];
            suf[i]=cpro;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                nums[i]=suf[i+1];
            }
            else if(i==nums.length-1)
            {
                nums[i]=pref[i-1];
            }
            else
            {
                nums[i]=pref[i-1]*suf[i+1];
            }
        }
        return nums;
    }
}