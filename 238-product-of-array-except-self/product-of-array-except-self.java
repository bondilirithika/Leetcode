class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int sum=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            sum*=nums[i];
            res[i]=sum;
        }
        int p=1;
        for(int i=0;i<nums.length;i++)
        {
            p*=nums[i];
            nums[i]=p;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            res[i]=res[i+1];
            else if(i==nums.length-1)
            res[i]=nums[i-1];
            else
            res[i]=nums[i-1]*res[i+1];
        }
        return res;
    }
}