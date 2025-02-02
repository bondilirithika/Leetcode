class Solution {
    public boolean check(int[] nums) {
        //Arrays.copyOfRange
        int[] dup=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(dup);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==dup[0])
            {
                int k=1;
                boolean s=false;
                for(int j=i+1;j<nums.length*2 && k<nums.length;j++)
                {
                    if(nums[(j%nums.length)]!=dup[k++])
                    {
                        s=true;
                        break;
                    }
                }
                if(s==false)
                return true;
            }
        }
        return false;
    }
}