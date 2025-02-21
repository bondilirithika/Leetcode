class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int[] ans=new int[m+n];
        int ind=0;
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(a[i]<=b[j])
            {
                ans[ind++]=a[i];
                i++;
            }
            else
            {
                ans[ind++]=b[j];
                j++;
            }
        }
        while(i<m)
        {
            ans[ind++]=a[i];
            i++;
        }
        while(j<n)
        {
            ans[ind++]=b[j++];
        }
        for(int k=0;k<m+n;k++)
        {
            a[k]=ans[k];
        }

    }
}