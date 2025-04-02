class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        int i=0;
        while(i<intervals.length)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(intervals[i][0]);
            int lim=intervals[i][1];
            while((i+1<intervals.length) && lim>=intervals[i+1][0])
            {
                lim=Math.max(lim,intervals[i+1][1]);
                i++;
            }
            temp.add(lim);
            arr.add(temp);
            i++;
        }
        int[][] ans=new int[arr.size()][2];
        int k=0;
        for(ArrayList<Integer> a:arr)
        {
            int c=0;
            for(int u:a)
            {
                ans[k][c++]=u;
            }
            k++;
        }
        return ans;
    }
}