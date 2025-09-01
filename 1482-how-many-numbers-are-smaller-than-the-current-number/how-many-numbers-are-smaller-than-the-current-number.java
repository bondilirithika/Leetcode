class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] temp=nums.clone();
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++)
        {
            if(!map.containsKey(temp[i]))
            {
                map.put(temp[i],i);
            }
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}