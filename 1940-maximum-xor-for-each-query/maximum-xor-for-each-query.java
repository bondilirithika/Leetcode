class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        //int st=nums.length-1;
        int c=0;
        int max=1<<maximumBit;
        int[] ans=new int[nums.length];
        int an=0;
        int[] pref=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            an=an^nums[i];
            pref[i]=an;
        }
        while(c<nums.length)
        {
            
                int a=pref[nums.length-1-c];
                int k=-1,m=-1;
                // for(int i=0;i<(max);i++)
                // {
                //     if((a^i)>m)
                //     {
                //         m=a^i;
                //         k=i;
                //     }
                //     if(m==max-1)
                //     break;
                // }
                // ans[c]=k;
                ans[c]=a^(max-1);
                c++;
            
        }
        return ans;
    }
}