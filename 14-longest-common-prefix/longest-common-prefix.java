class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str=new StringBuilder();
        Arrays.sort(strs,(a,b)->a.length()-b.length());
        int flag=0;
        //char[] ref=strs[0].toCharArray();
        for(int i=0;i<strs[0].length();i++)
        {
            if(flag==0)
            {
            str.append(strs[0].charAt(i));
            for(int j=1;j<strs.length;j++)
            {
                if(!str.toString().equals(strs[j].substring(0,str.length())))
                {
                    str.deleteCharAt(str.length()-1);
                    flag=1;
                    break;
                }
            }
            }
            else
            break;
        }
        return str.toString();
    }
}