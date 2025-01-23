class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder ans=new StringBuilder();
        ans.append('0');
        if(n==1)
        return '0';
        n--;
        while(n>0)
        {
            String rev=invert(new StringBuilder(ans));
            ans.append('1');
            ans.append(rev);
            n--;
        }
        return ans.charAt(k-1);
    }

    String invert(StringBuilder ans)
    {
       for(int i=0;i<ans.length();i++)
       {
        if(ans.charAt(i)=='0')
        ans.setCharAt(i,'1');
        else
        ans.setCharAt(i,'0');
       }
       return ans.reverse().toString();
    }
}