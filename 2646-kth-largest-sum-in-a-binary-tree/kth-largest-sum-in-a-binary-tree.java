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
        HashMap<Integer,Long> map=new HashMap<>();
        Queue<pair> q=new LinkedList<>();
        PriorityQueue<Long> pq=new PriorityQueue<>();
        q.add(new pair(root,0));
        while(!q.isEmpty())
        {
            pair p=q.poll();
            TreeNode node=p.n;
            int lev=p.l;
            map.put(lev,(map.getOrDefault(lev,0L)+node.val));
            if(node.left!=null)
            q.add(new pair(node.left,lev+1));
            if(node.right!=null)
            q.add(new pair(node.right,lev+1));
        }

        for(int i:map.keySet())
        {
            long key=map.get(i);
            pq.add(key);
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