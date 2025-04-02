class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=0;
        while(left>=0 && right<n)
        {
            if(nums1[left]>nums2[right])
            {
                swap(nums1,nums2,left,right);
                left--;
                right++;
            }
            else
            break;
        }
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        int i=m,j=0;
        while(i<(m+n))
        {
            nums1[i++]=nums2[j++];
        }

    }
    void swap(int[] nums1,int[] nums2,int i,int j)
    {
        int temp=nums1[i];
        nums1[i]=nums2[j];
        nums2[j]=temp;
    }
}