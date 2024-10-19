class Solution {
    public String mergeAlternately(String u, String v) {
        int i=0,j=0;
        StringBuilder ans=new StringBuilder();
        while(i<u.length() && j<v.length())
        {
            ans.append(u.charAt(i));
            ans.append(v.charAt(j));
            i++;
            j++;
        }
        while(i<u.length())
        {
            ans.append(u.charAt(i));
            i++;
        }
        while(j<v.length())
        {
            ans.append(v.charAt(j));
            j++;
        }
        return ans.toString();
    }
}