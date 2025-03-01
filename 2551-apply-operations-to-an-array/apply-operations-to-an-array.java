class Solution {
    public int[] applyOperations(int[] nums) {
        int[] ans=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0){
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                ans[k++]=nums[i]*2;
                nums[i+1]=0;
            }
            else
            {
                if(nums[i]!=0)
                ans[k++]=nums[i];
            }
            }
        }
        while(k<nums.length)
        {
            ans[k++]=0;
        }
        return ans;
    }
}