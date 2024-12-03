class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int ind=0;
        for(int i=0;i<s.length();i++)
        {
            if(ind<spaces.length && i==spaces[ind])
            {
                str.append(' ');
                ind++;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}