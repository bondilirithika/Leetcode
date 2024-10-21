class Solution {
    int max;
    public int maxUniqueSplit(String s) {
        max=Integer.MIN_VALUE;
        return solve(new ArrayList<String>(),0,s);
    }

    int solve(ArrayList<String> arr,int ind,String s)
    {
        if(ind==s.length())
        {
            return arr.size();
        }
        //partition at every index
        for(int i=ind;i<s.length();i++)
        {
            if(!arr.contains(s.substring(ind,i+1)))
            {
                arr.add(s.substring(ind,i+1));
                max=Math.max(max,solve(arr,i+1,s));
                arr.remove(arr.size()-1);
            }
        }
        return max;
    }
}