class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            temp[i]=nums[i];
        }
        int rem=k%nums.length;
        for(int i=0;i<nums.length;i++)
        {
            nums[(i+rem)%nums.length]=temp[i];
        }
    }
}