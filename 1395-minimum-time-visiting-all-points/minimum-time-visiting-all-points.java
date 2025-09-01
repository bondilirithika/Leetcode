class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=0;i<points.length-1;i++)
        {
            int max=0;
            for(int j=0;j<points[0].length;j++)
            {
                max=Math.max(max,Math.abs(points[i][j]-points[i+1][j]));
            }
            time+=max;
        }
        return time;
    }
}