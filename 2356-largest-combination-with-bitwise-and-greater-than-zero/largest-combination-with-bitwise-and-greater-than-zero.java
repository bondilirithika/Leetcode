class Solution {
    public int largestCombination(int[] ch) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<32;i++)
        {
            c=0;
            for(int n:ch)
            {
                if((n & (1<<i))!=0)
                {
                    c++;
                }
            }
            max=Math.max(max,c);
        }
        return max;
    }
}