class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permutation(ans,new int[nums.length],nums,new ArrayList<Integer>());
        return ans;
    }
    void permutation(List<List<Integer>> ans,int[] vis,int[] nums,ArrayList<Integer> present)
    {
        if(present.size()==nums.length && !ans.contains(present))
        {
            ans.add(new ArrayList<Integer>(present));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(vis[i]==0)
            {
                vis[i]=1;
                present.add(nums[i]);
                permutation(ans,vis,nums,present);
                present.remove(present.size()-1);
                vis[i]=0;
            }
        }
    }
}