class Solution {
    public boolean canChange(String start, String target) {
        int i=0,j=0;
        while(i<start.length() || j<target.length())
        {
            while(i<start.length() && start.charAt(i)=='_')
            {
                i++;
            }
            while(j<target.length() && target.charAt(j)=='_')
            {
                j++;
            }
            if((i<start.length() && j>=target.length()) || (i>=start.length() && j<target.length()))
            return false;

            if(i<start.length() && j<target.length() &&start.charAt(i)!=target.charAt(j))
            return false;
            if(i<start.length() && j<target.length() && start.charAt(i)=='L' && target.charAt(j)=='L')
            {
                if(i<j)
                return false;
            }
            if(i<start.length() && j<target.length() && start.charAt(i)=='R' && target.charAt(j)=='R')
            {
                if(i>j)
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}