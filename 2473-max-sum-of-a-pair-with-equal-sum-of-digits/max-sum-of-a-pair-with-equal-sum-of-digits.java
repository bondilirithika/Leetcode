class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i:nums)
        {
            int k=i;
            int sum=0;
            while(i>0)
            {
                sum+=i%10;
                i=i/10;
            }
            map.putIfAbsent(sum,new ArrayList<Integer>());
            map.get(sum).add(k);
        }
        int ans=-1;
        for(Integer k:map.keySet())
        {
            ArrayList<Integer> temp=map.get(k);
            if(temp.size()<2)
            continue;
            if(temp.size()>2)
            {
                Collections.sort(temp);
            }
            ans=Math.max(ans,temp.get(temp.size()-1)+temp.get(temp.size()-2));
        }
        return ans;
    }
}