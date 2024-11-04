class Solution {
    public String compressedString(String word) {
        char cur='.';
        int count=1;
        StringBuilder str=new StringBuilder();
        for(char ch:word.toCharArray())
        {
            if(ch==cur)
            {
                if(count<9)
                count++;
                else
                {
                    str.append(count);
                    str.append(cur);
                    count=1;
                }
            }
            else
            {
                if(cur=='.')
                {
                    cur=ch;
                    continue;
                }
                else
                {
                    str.append(count);
                    str.append(cur);
                    cur=ch;
                    count=1;
                }
            }
        }
        str.append(count);
        str.append(cur);
        return str.toString();
    }
}