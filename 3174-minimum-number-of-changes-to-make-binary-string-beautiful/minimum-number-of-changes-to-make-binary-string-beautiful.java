class Solution {
    public int minChanges(String s) {
        //prev//next to prev an next 
        char prev='.';
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if((i+1)%2!=0)
            {
                prev=s.charAt(i);
            }
            else
            {
                if(s.charAt(i)!=prev)
                count++;
            }
        }
        return count;
    }
}