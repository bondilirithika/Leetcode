class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int[] pref=new int[nums.length];
        int csum=0;
        for(int i=0;i<nums.length;i++)
        {
            csum+=nums[i];
            pref[i]=csum;
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int req=pref[i]-k;
            if(map.containsKey(req))
            {
                count+=map.get(req);
                //map.put(req,map.get(req)+1);   
            }
            
            map.put(pref[i],map.getOrDefault(pref[i],0)+1);
            
        }
        return count;
    }
}