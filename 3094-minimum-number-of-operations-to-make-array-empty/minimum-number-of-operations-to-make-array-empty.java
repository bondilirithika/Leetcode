class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int op=0;
        for(int k:map.keySet())
        {

            int a=map.get(k);
            if(a<2)
            return -1;
            op+=a/3;
            if(a%3>0)
            {
                op++;
            }
        }
        return op;
    }
}