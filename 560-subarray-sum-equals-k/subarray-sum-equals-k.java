class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            prefsum+=nums[i];
            int req=prefsum-k;
            if(map.containsKey(req))
            {
                count+=map.get(req);
            }
            map.put(prefsum,map.getOrDefault(prefsum,0)+1);
        }
        return count;
    }
}