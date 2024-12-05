class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int k:map.keySet())
        {
            int a=map.get(k);
            if(a==2)
            count+=1;
            if(a<2)
            return -1;
            if(a>2)
            {
                int div=a/3;
                int rem=a%3;
                if(rem==0)
                {
                    count+=div;
                }
                else if(rem == 1)
                {
                    count+=div-1;
                    rem=a-(div-1)*3;
                    if(rem%2==0)
                    {
                        count+=rem/2;
                    }
                }
                else
                {
                    count+=div;
                    rem=a-(div)*3;
                    count+=rem/2;
                }
            }

        }
        return count;
    }
}