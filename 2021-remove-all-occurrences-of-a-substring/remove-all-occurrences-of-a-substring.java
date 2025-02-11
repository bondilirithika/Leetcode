class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
        solve(str,part);
        return str.toString();
    }

    void solve(StringBuilder s,String part)
    {
        if(s.indexOf(part)==-1)
        return;
        for(int i=0;i<=s.length()-part.length();i++)
        {
            if(s.substring(i,i+part.length()).equals(part))
            {
                for(int j=i;j<i+part.length();j++)
                s.deleteCharAt(i);
                solve(s,part);
            }
        }

    }
}