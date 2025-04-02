class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        //keep track of the last element i the nums1
        int k=m-1;
        while(j<n && i<(n+m) && !(i>=k && nums1[i]==0))
        {
            if(nums1[i]<=nums2[j])
            {
                i++;
            }
            else
            {
                move(nums1,i);
                nums1[i]=nums2[j];
                j++;
                i++;
                k++;
            }
        }
        while(i<(n+m) && j<n)
        {
            move(nums1,i);
                nums1[i]=nums2[j];
                j++;
                i++;
        }
    }
    void move(int[] nums,int i)
    {
        for(int j=nums.length-1;j>i;j--)
        {
            nums[j]=nums[j-1];
        }
    }
}