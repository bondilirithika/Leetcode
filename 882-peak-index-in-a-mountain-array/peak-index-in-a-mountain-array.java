class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //binary search
        //arr[i]<arr[i+1]->left of peak and arr[i>arr[i+1]->right of peak]

        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<r)
        {
            mid=(l+r)/2;
            if(arr[mid]<arr[mid+1])
            {
                l=mid+1;
            }
            else
            r=mid;
        }
        return l;
    }
}