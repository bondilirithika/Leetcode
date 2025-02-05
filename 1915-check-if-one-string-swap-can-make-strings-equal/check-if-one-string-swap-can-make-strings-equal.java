class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
        return false;
        StringBuilder str=new StringBuilder(s2);
        int i=0,j=0;
        int swap=0;
        while(i<s1.length() && j<s1.length())
        {
            if(s1.charAt(i)==str.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if(swap>=1)
                return false;
                while(j<s1.length())
                {
                    if(s1.charAt(i)==str.charAt(j) && str.charAt(i)==s1.charAt(j))
                    {
                        swap++;
                        str.setCharAt(i,s2.charAt(j));
                        str.setCharAt(j,s2.charAt(i));
                        i++;
                        j=i;
                        break;
                    }
                    else
                    j++;
                }
                if(j>=s1.length())
                return false;
            }
        }
        return true;
    }
}