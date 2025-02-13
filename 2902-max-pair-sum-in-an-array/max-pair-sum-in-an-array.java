class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i:nums)
        {
            int n=i;
            int d=-1;
            while(i>0)
            {
                d=Math.max(d,i%10);
                i=i/10;
            }
            map.putIfAbsent(d,new ArrayList<Integer>());
            map.get(d).add(n);
        }
        int ans=-1;
        for(int k:map.keySet())
        {
            if(map.get(k).size()<2)
            continue;
            if(map.get(k).size()==2)
            {
                ans=Math.max(ans,map.get(k).get(0)+map.get(k).get(1));
            }
            else
            {
                ArrayList<Integer> arr=map.get(k);
                Collections.sort(arr,(a,b)->b-a);
                ans=Math.max(ans,arr.get(0)+arr.get(1));    
            }
        }
        return ans;
    }
}