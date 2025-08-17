class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            StringBuilder locstr=new StringBuilder();
            while(i>=0 && s.charAt(i)==' ')
            {
                i--;
            }
            while(i>=0 && s.charAt(i)!=' ')
            {
                locstr.append(s.charAt(i));
                i--;
            }
            if(locstr.length()!=0){
            str.append(locstr.reverse());
            str.append(' ');
            }
        }
        return str.toString().trim();
    }
}