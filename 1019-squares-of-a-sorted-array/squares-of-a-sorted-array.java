class Solution {
    public int[] sortedSquares(int[] nums) {
        //remove engative sign and sort teh array again
        //treat like an unsorted array
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}