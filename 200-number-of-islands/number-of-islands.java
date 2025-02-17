class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(boolean[] arr:vis)
        Arrays.fill(arr,false);
        int ans=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    ++ans;
                    q.add(new int[]{i,j});
                    vis[i][j]=true;
                    while(!q.isEmpty())
                    {
                        int[] a=q.poll();
                        int x=a[0];
                        int y=a[1];
                        if(x+1>=0 && x+1<grid.length && y>=0 && y<grid[0].length && !vis[x+1][y] && grid[x][y]=='1')
                        {
                            q.add(new int[]{x+1,y});
                            vis[x+1][y]=true;
                        }
                        if(x-1>=0 && x-1<grid.length && y>=0 && y<grid[0].length && !vis[x-1][y]&& grid[x][y]=='1')
                        {
                            q.add(new int[]{x-1,y});
                            vis[x-1][y]=true;
                        }
                        if(x>=0 && x<grid.length && y+1>=0 && y+1<grid[0].length && !vis[x][y+1]&& grid[x][y]=='1')
                        {
                            q.add(new int[]{x,y+1});
                            vis[x][y+1]=true;
                        }
                        if(x>=0 && x<grid.length && y-1>=0 && y-1<grid[0].length && !vis[x][y-1]&& grid[x][y]=='1')
                        {
                            q.add(new int[]{x,y-1});
                            vis[x][y-1]=true;
                        }
                    }
                }
            }
        }
        return ans;
    }
}