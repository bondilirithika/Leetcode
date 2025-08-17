class Solution {
    public int maxProfit(int[] prices) {
        //sell>buy->buy must be min
        int buy=prices[0];
        int maxpro=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
                continue;
            }
            int pro=prices[i]-buy;
            maxpro=Math.max(pro,maxpro);
        }
        return maxpro;
    }
}