class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] ans=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[k++]=nums1[i++];
            }
            else
            {
                ans[k++]=nums2[j++];
            }
        }
        while(i<m)
        {
            ans[k++]=nums1[i++];
        }
        while(j<n)
        {
            ans[k++]=nums2[j++];
        }
        for(int p=0;p<m+n;p++)
        {
            nums1[p]=ans[p];
        }
    }
}