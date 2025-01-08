class Solution {
    int ans;
    
    public int countPrefixSuffixPairs(String[] s) {
        ans=0;
        for(int i=0;i<s.length-1;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                if(s[i].length()<=s[j].length())
                {
                    isps(s[i],s[j]);
                }

            }
        }
        return ans;
    }

    void isps(String s1,String s2)
    {
        if(s2.substring(0,s1.length()).equals(s1) && s2.substring(s2.length()-s1.length(),s2.length()).equals(s1))
        ans++;
    }
}