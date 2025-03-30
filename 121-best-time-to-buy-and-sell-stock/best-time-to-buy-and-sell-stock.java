class Solution {
    public int maxProfit(int[] prices) {
        //max pro sell high buy low
        int min=prices[0];
        int ans=0;
        for(int i:prices)
        {
            if(i<min)
            min=i;
            ans=Math.max(ans,i-min);
        }
        return ans;
    }
}