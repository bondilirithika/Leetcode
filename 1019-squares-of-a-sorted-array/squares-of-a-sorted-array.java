class Solution {
    public int[] sortedSquares(int[] nums) {
        //remove engative sign and sort teh array again
        //treat like an unsorted array
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums)
        {
            pq.add(i*i);
        }
        int i=0;
        while(!pq.isEmpty())
        {
            int k=pq.poll();
            nums[i++]=k;
        }
        return nums;
    }
}