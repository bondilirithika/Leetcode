class Solution {
    public char findKthBit(int n, int k) {
        String[] s=new String[n];
        s[0]="0";
        for(int i=1;i<n;i++)
        {
            StringBuilder str=new StringBuilder(s[i-1]);
            str.append('1');
            StringBuilder invert=new StringBuilder();
            for(int j=s[i-1].length()-1;j>=0;j--)
            {
                if(s[i-1].charAt(j)=='0')
                {
                    invert.append('1');
                }
                else
                invert.append('0');
            }
            str.append(invert.toString());
            s[i]=str.toString();
        }
        return s[n-1].charAt(k-1);
    
    }


}