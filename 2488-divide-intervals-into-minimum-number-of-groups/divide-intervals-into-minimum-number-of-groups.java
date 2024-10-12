/*class Solution {
    public int minGroups(int[][] intervals) {
        //sort based on intervals[0] and store them in an arraylist
        //visited array 
        
        int n=intervals.length;
        ArrayList<pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(new pair(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(arr,(a,b)->Integer.compare(a.f,b.f));
        int[] vis=new int[n];
        int g=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
            int tar=arr.get(i).s;
            for(int j=i+1;j<n;j++)
            {
                if(vis[j]==0 && arr.get(j).f>tar)
                {
                    vis[j]=1;
                    tar=arr.get(j).s;
                }
            }
            g++;
            }
        }
        return g;


    }
}
class pair{
    int f,s;
    pair(int f,int s)
    {
        this.f=f;
        this.s=s;
    }
}*/


class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int[] arr:intervals)
        {
            if(!pq.isEmpty() && arr[0]>pq.peek())
            {
                pq.poll();
            }
            pq.add(arr[1]);
        }
        return pq.size();
    }
}
