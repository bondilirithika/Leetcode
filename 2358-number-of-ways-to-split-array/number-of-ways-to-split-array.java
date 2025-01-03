class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] pref=new long[nums.length];
        long s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            pref[i]=s;
        }
        int ans=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(pref[i]>=(pref[nums.length-1]-pref[i]))
            {
                ans++;
            }
        }
        return ans;
    }
}