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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return ans;
        int lev=0;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode t=q.poll();
                map.put(lev,map.getOrDefault(lev,new ArrayList<Integer>()));
                ArrayList<Integer> arr=map.get(lev);
                arr.add(t.val);
                map.put(lev,arr);
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
            }
            lev++;
        }
        //ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<map.size();i++)
        {
            ArrayList<Integer> a=map.get(i);
            ans.add(a.get(a.size()-1));
        }
        return ans;
    }
}