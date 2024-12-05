class Solution {
    public void nextPermutation(int[] nums) {
        int i=0; 
        for(i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                
                break;
            }
        }
        if(i>=0){
        for(int j=nums.length-1;j>i;j--)
        {
            if(nums[j]>nums[i])
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        }

        int l=i+1;
        int r=nums.length-1;
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        
    }
}