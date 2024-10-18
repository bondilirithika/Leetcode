class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet())
        {
            int v=map.get(k);
            if(v!=3)
            return k;
        }
        return -1;
    }
}