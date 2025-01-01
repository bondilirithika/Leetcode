class Solution {
    public int maxScore(String s) {
        //prefix -suffix array
        int[] zero=new int[s.length()];
        int[] one=new int[s.length()];
        int z=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                z++;
            }
            zero[i]=z;
        }
        int o=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                o++;
            }
            one[i]=o;
        }
        int ans=0;
        for(int i=0;i<s.length()-1;i++)
        {
            ans=Math.max(ans,zero[i]+one[i+1]);
        }
        return ans;
    }
}