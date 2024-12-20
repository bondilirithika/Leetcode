class Solution {
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int i:nums)
        {
            if(i>=max)
            max=i;
            sum+=i;
        }
        int low=max;
        int high=sum;

        while(low<high)
        {
            int mid=(low+high)/2;
            System.out.println(mid);
            int m=calc(mid,nums);
            //System.out.println(m);
            if(m>k)
            {
                low=mid+1;
            }
            else if(m<k)
            {
                high=mid-1;
            }
            else
            {
                high= mid;
            }
        }
        return low;

        

    }
    int calc(int mid,int[] nums)
        {
            int ans=0;
            int csum=0;
            int i=0;
            while(i<nums.length)
            {
                 csum=nums[i];
                if(csum<=mid)
                ans++;
                i++;
                while(i<nums.length && csum+nums[i]<=mid)
                {
                    csum+=nums[i];
                    i++;
                    //continue;
                }
                
            }
            return ans;
        }
}