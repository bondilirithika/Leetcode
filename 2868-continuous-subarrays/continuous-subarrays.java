class Solution {
    public long continuousSubarrays(int[] nums) {
        long count=0;
        //count+=nums.length;
        PriorityQueue<Integer> min=new PriorityQueue<>();
        PriorityQueue<Integer> max=new PriorityQueue<>((a,b)->b-a);
        int l=0;
        int mi,ma;
        for(int r=0;r<nums.length;r++)
        {
            min.add(nums[r]);
            max.add(nums[r]);
            while(Math.abs(min.peek()-max.peek())>2)
            {
                min.remove(nums[l]);
                max.remove(nums[l]);
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}