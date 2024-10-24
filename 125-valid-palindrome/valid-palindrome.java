class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                if(Character.isUpperCase(ch))
                {
                    str.append(Character.toLowerCase(ch));
                }
                else
                str.append(ch);
            }
        }

        return Palindrome(str.toString());

    }

    boolean Palindrome(String s)
    {
        int f=0;
        int l=s.length()-1;
        while(f<l)
        {
            if(s.charAt(f)==s.charAt(l))
            {
                f++;
                l--;
            }
            else
            return false;
        }
        return true;
    }
}