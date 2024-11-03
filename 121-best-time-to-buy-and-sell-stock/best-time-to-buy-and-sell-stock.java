class Solution {
    public int maxProfit(int[] prices) {
        //it all lies in finding the min to the left
        int maxpro=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(min<prices[i])
            {
                maxpro=Math.max(maxpro,prices[i]-min);
            }
            else if(min>prices[i])
            min=prices[i];
        }
        return maxpro;
    }
}