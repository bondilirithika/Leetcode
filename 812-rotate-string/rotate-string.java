class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        int p=0;
        ArrayList<Integer> pos=new ArrayList<>();
        char ch=goal.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                pos.add(i);
            }
        }

        for(int i:pos)
        {
            int j=i;
            p=0;
            while(p!=goal.length())
            {
                if(j==s.length())
                j=0;
                if(s.charAt(j)==goal.charAt(p))
                {
                    j++;
                    p++;
                }
                else
                break;
            }
            if(p==goal.length())
            return true;
        }
        return false;
        
    }
}