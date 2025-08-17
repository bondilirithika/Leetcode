class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Comparator<ArrayList<Integer>> com=new Comparator<>()
        {
            @Override
            public int compare(ArrayList<Integer> a,ArrayList<Integer> b)
            {
                return b.get(1)-a.get(1);
            }
        };
        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>(com);
        for(int ko:map.keySet())
        {
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(ko);
            arr.add(map.get(ko));
            pq.add(arr);
        }

        int[] ans=new int[k];
        int i=0;
        while(k!=0)
        {
            ArrayList<Integer> a=pq.poll();
            ans[i++]=a.get(0);
            k--;
        }
        return ans;
        
    }
}