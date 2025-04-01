class Solution {
    ArrayList<ArrayList<Integer>> p;
    int ki;
    public String getPermutation(int n, int k) {
        //brute force?
        ki=k;
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        p=new ArrayList<>();
        perm(nums,n,new ArrayList<Integer>(),new int[n]);
        String ans="";
        for(int i:p.get(k-1))
        {
            ans+=i;
        }
        return ans;
    }

    void perm(int[] nums,int n,ArrayList<Integer> temp,int[] vis)
    {
        if(ki==0)
        return;
        if(temp.size()==n)
        {
            p.add(new ArrayList<Integer>(temp));
            ki--;
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                temp.add(nums[i]);
                vis[i]=1;
                perm(nums,n,temp,vis);
                vis[i]=0;
                temp.remove(temp.size()-1);
            }
        }
    }
}