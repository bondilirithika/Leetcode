class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums)
        {
            pq.add(i);
        }
        int ans=0;
        while(pq.size()>=2 && pq.peek()<k)
        {
            int a=pq.poll();
            int b=pq.poll();
            if(a>(Integer.MAX_VALUE -b)/2)
            pq.add(k);
            else
            pq.add((2*a)+(b));
            ans++;
        }
        return ans;
    }
}