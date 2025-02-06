class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> pro=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                
                    pro.put(nums[i]*nums[j],pro.getOrDefault(nums[i]*nums[j],0)+1);
                
            }
        }

        for(int n:pro.values())
        {
            if(n>=2)
            {
                ans+=(n*(n-1)*4);
            }
        }
        return ans;
    }
}