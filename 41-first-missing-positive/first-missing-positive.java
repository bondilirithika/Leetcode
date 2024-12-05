class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(i>0)
            {
                set.add(i);
            }
        }
        int i=-99;
        if(set.size()==0)
        return 1;
        else 
        {
            for(i=1;i<=nums.length;i++)
            {
                if(!set.contains(i))
                return i;
            }
        }
        return i;

    }
}