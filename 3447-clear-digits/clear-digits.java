class Solution {
    public String clearDigits(String s) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<='9' && str.charAt(i)>='0')
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(str.charAt(j)<='z' && str.charAt(j)>='a')
                    {
                        str.deleteCharAt(j);
                        str.deleteCharAt(j);
                        i=i-2;
                        break;
                    }
                }
                
            }
        }
        return str.toString();
    }
}