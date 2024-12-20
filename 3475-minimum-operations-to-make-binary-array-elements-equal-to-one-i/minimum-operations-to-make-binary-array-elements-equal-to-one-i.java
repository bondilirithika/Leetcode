class Solution {
    public int minOperations(int[] nums) {
        //sliding window
        ArrayList<Integer> arr=new ArrayList<>();
        int ans=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]==0)
            {
                ans++;
                int k=i;
                int count=3;
                while(count>0)
                {
                    nums[k]=nums[k]^1;
                    k++;
                    count--;
                }
            }
        }
        for(int i=nums.length-3;i<nums.length;i++)
        {
            if(nums[i]==0)
            return -1;
        }
        return ans;
    }
}