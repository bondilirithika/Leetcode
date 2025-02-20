class Solution {
    public int maxProfit(int[] prices) {
        //min buy high sell
        int pro=0;
        int min=Integer.MAX_VALUE;
        for(int i:prices)
        {
            if(i<min)
            min=i;
            else
            pro=Math.max(pro,i-min);
        }
        return pro;
    }
}