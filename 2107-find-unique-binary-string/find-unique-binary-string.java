class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        for(String s:nums)
        {
            set.add(s);
        }
        return solve(set,0,nums[0].length(),"");
    }
    String solve(HashSet<String> nums,int ind,int n,String str)
    {
        if(ind>=n)
        {
            if(!nums.contains(str))
            return str;
            else
            return null;
        }

        String op1=solve(nums,ind+1,n,str+"0");
        if(op1!=null)
            return op1;
        String op2=solve(nums,ind+1,n,str+"1");
        if(op2!=null)
            return op2;

        return null;
    }
}