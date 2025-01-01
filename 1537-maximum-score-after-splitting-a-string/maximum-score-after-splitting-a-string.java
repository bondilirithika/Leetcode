class Solution {
    public int maxScore(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++)
        {
            String z=s.substring(0,i+1);
            String o=s.substring(i+1,s.length());
            int k=0;
            for(char c:z.toCharArray())
            {
                if(c=='0')
                {
                    k++;
                }
            }
            for(char c:o.toCharArray())
            {
                if(c=='1')
                {
                    k++;
                }
            }
            ans=Math.max(ans,k);
        }
        return ans;
    }
}