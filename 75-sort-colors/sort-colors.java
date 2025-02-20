class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ind=0;
        for(int i=0;i<=2;i++)
        {
            int c=map.getOrDefault(i,0);
            while(c>0)
            {
                nums[ind++]=i;
                c--;
            }
        }
    }
}