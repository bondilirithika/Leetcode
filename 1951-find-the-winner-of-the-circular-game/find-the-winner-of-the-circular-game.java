class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            q.add(i);
        }
        int g=k;
        while(q.size()>1)
        {
            while(k>1)
            {
                int a=q.poll();
                q.add(a);
                k--;
            }
            if(k==1)
            {
                q.poll();
                k=g;
            }
        }
        return q.poll();

    }
}