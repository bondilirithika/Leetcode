class Solution {
    public String longestPalindrome(String s) {
        int maxlen=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(j-i+1>maxlen)
                {
                String sub=s.substring(i,j+1);
                if(ispalin(sub))
                {
                    maxlen=j-i+1;
                    ans=sub;
                }
                }
            }
        }
        return ans;

       
    }
     boolean ispalin(String str)
        {
            int i=0,j=str.length()-1;
            while(i<j)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    i++;
                    j--;
                }
                else
                return false;
            }
            return true;
        }
}