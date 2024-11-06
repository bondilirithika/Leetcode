class Solution {
    public boolean canSortArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,setbits(i)));
        }

        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    if(map.get(nums[j])==map.get(nums[j+1]))
                    {
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                    else
                    return false;
                }
            }
        }
        return true;
    }

    int setbits(int n)
    {
        int count=0;
        String s=Integer.toBinaryString(n);
        for(char ch:s.toCharArray())
        {
            if(ch=='1')
            count++;
        }
        return count;
    }
}