class Solution {
    public int smallestChair(int[][] times, int tf) {
        //arrives based on arrival time so it is to be sorted
        //on arrival the chair is to be taken 
        //on departure/leaving the chair i s to be added onto the available chairs
        ArrayList<pair> arr=new ArrayList<>();
        PriorityQueue<Integer> availablechairs=new PriorityQueue<>();
        PriorityQueue<pair> leavingq=new PriorityQueue<>((a,b)->Integer.compare(a.f,b.f));
        int n=times.length;
        for(int i=0;i<n;i++)
        {
            arr.add(new pair(times[i][0],i));
        }
        Collections.sort(arr,(a,b)->Integer.compare(a.f,b.f));

        for(int i=0;i<=n;i++)
        {
            availablechairs.add(i);
        }

        for(int i=0;i<n;i++)
        {
            pair p=arr.get(i);
            while(!leavingq.isEmpty() && leavingq.peek().f<=p.f)
            {
                availablechairs.add(leavingq.peek().s);
                leavingq.poll();
            }

            int aschair=availablechairs.poll();
            if(p.s==tf)
            return aschair;
            leavingq.add(new pair(times[p.s][1],aschair));
        }
        return -1;

    }
}

class pair
{
    int f,s;
    pair(int f,int s)
    {
        this.f=f;
        this.s=s;
    }
}