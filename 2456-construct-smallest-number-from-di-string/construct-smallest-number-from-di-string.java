class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=pattern.length()+1;i++)
        {
            s.append(i+"");
        }
        System.out.println(s.toString
        ());
        for(int j=0;j<pattern.length();j++){
            String p=s.toString();
        for(int i=0;i<pattern.length();i++)
        {
            if(pattern.charAt(i)=='D')
            {
                if(s.charAt(i)<s.charAt(i+1))
                {
                    char c=s.charAt(i);
                    s.setCharAt(i,s.charAt(i+1));
                    s.setCharAt(i+1,c);
                }
            }
            else
            {
                if(s.charAt(i)>s.charAt(i+1))
                {
                    char c=s.charAt(i);
                    s.setCharAt(i,s.charAt(i+1));
                    s.setCharAt(i+1,c);
                }
            }
        }
        if(p.equals(s.toString()))
        break;
        }
        return s.toString();
    }
}