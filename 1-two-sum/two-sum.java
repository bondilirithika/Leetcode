
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i,j=-1;
        int[] a=new int[2];
        for(i=0;i<nums.length;i++)
        {
            int req=target-nums[i];
            if(map.containsKey(req))
            {
                if(i!=map.get(req))
                {
                    j=map.get(req);
                    break;
                }
            }
            map.put(nums[i],i);
        }
        if(j!=-1)
        {
        a[0]=i;
        a[1]=j;
        }
        return a;
    }
}