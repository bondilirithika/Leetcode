class Solution {
    public String makeFancyString(String s) {
        return solve(s,0,1,'.',new StringBuilder());
    }
    //recursion at every index
    String solve(String s,int ind,int count,char ch,StringBuilder str)
    {
        if(ind>=s.length())
        return str.toString();
        if(s.charAt(ind)==ch)
        {
            if(count+1<=2)
            {
                str.append(ch);
            }
            return solve(s,ind+1,count+1,ch,str);
        }
        else
        {
            str.append(s.charAt(ind));
        return solve(s,ind+1,1,s.charAt(ind),str);
        }
    }
}