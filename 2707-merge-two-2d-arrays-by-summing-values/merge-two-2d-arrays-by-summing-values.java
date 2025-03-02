class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        //int r=0;
        HashSet<Integer> set=new HashSet<>();
        for(int[] m:nums1)
        {
            if(!set.contains(m[0]))
            {
                set.add(m[0]);
            }
        }
        for(int[] m:nums2)
        {
            if(!set.contains(m[0]))
            {
                set.add(m[0]);
            }
        }
        int[][] ans=new int[set.size()][2];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            int[] a=nums1[i];
            int[] b=nums2[j];
            if(a[0]<b[0])
            {
                ans[k++]=nums1[i++];
            }
            else if(a[0]==b[0])
            {
                ans[k++]=new int[]{a[0],a[1]+b[1]};
                i++;
                j++;
            }
            else
            {
                ans[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            ans[k++]=nums2[j++];
        }
        return ans;
    }
}