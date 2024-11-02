class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(i==0)
            {
                if(str[i].charAt(0)!=str[str.length-1].charAt(str[str.length-1].length()-1))
                {
                    return false;
                }
            }

            else
            {
                if(str[i].charAt(0)!=str[i-1].charAt(str[i-1].length()-1))
                {
                    return false;
                }
            }
        }
        return true;
    }
}