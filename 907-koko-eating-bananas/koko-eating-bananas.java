class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1;
        int high=piles[piles.length-1];
        while(low<high)
        {
            int mid=(low+high)/2;
            int time=calc(mid,piles);
            if(time>h)
            {
               low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return low;
    }

    int calc(int mid,int[] piles)
    {
        int time=0;
        for(int i:piles)
        {
            double a=Math.ceil((double)i/mid);
            time+=(int)a;
        }
        return time;
    }
}