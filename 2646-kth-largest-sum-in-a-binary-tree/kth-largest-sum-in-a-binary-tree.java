/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        //HashMap<Integer,Long> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        PriorityQueue<Long> pq=new PriorityQueue<>();
        q.add(root);
        while(!q.isEmpty())
        {
            long sum=0;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
            TreeNode p=q.poll();
            //TreeNode node=p.n;
            //int lev=p.l;
            //map.put(lev,(map.getOrDefault(lev,0L)+node.val));
            if(p.left!=null)
            q.add(p.left);
            if(p.right!=null)
            q.add(p.right);
            sum+=p.val;
            }
            pq.add(sum);
        }
        int req=pq.size()-k;
        if(req<0)
        return -1;
        while(req!=0)
        {
            pq.poll();
            req--;
        }
        return pq.peek();

    }
}
class pair
{
    TreeNode n;
    int l;
    pair(TreeNode n,int l)
    {
        this.n=n;
        this.l=l;
    }
}