class Solution {
    public void sortColors(int[] nums) {
        //3 pointers low mid high
        // index 0 to low-1->0
        // indexlow to mid-1->1
        // mid to high->mixed
        // index high+1 to n-1->2
        //since gib=ven is mixed we will take 0to be mid and n-1 to be high nad starting so low will be at 0
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,high,mid);
                high--;
            }
        }
    }

    void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}