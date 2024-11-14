class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] vis=new boolean[arr.length];
        return solve(arr,start,vis);
    }

    boolean solve(int[] arr,int cur,boolean[] vis)
    {
        
        if(cur>=arr.length || cur<0 || vis[cur])
        return false;
        if(arr[cur]==0)
        return true;
        vis[cur]=true;
        boolean op1=solve(arr,cur+arr[cur],vis);
        boolean op2=solve(arr,(cur-arr[cur]),vis);
        return op1||op2;
    }
}