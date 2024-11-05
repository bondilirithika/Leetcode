class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans=new ArrayList<>();
        if(nums.length==0)
        return ans;
        int s=nums[0],e=0;
        int p=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==p+1)
            {
                p=nums[i];
                continue;
            }
            else
            {
                e=nums[i-1];
                if(s==e)
                ans.add(Integer.toString(s));
                else
                {
                    ans.add(s+"->"+e);
                }
                s=nums[i];
                p=nums[i];
            }
        }
        e=nums[nums.length-1];
        if(s==e)
        ans.add(Integer.toString(s));
        else
        {
            ans.add(s+"->"+e);
        }
        return ans;
    }
}