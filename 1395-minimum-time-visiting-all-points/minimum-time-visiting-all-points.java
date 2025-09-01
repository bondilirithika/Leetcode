class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=0;i<points.length-1;i++)
        {
            time+=comp(points[i],points[i+1]);
        }
        return time;
    }
    int comp(int[] from,int[] to)
    {
        return Math.max((Math.abs(from[0]-to[0])),Math.abs(from[1]-to[1]));
    }
}