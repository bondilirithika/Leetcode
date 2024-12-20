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
    public TreeNode reverseOddLevels(TreeNode root) {
        HashMap<Integer,ArrayList<TreeNode>> map=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        ArrayList<TreeNode> apt=new ArrayList<>();
        apt.add(root);
        map.put(0,apt);
        q.add(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int lev=p.lev;
            TreeNode n=p.t;
            if(n.left!=null)
            {
                q.add(new Pair(lev+1,n.left));
                
            }
            if(n.right!=null)
            {
                 q.add(new Pair(lev+1,n.right));
            }
            map.put(lev+1,map.getOrDefault(lev+1,new ArrayList<TreeNode>()));
                ArrayList<TreeNode> arr=map.get(lev+1);
                if(n.left!=null)
                arr.add(n.left);
                if(n.right!=null)
                arr.add(n.right);
                map.put(lev+1,arr);
        }

        for(int j=0;j<map.size();j++)
        {
            if(j%2!=0)
            {
                ArrayList<TreeNode> arr=map.get(j);
                for(int i=0;i<arr.size()/2;i++)
                {
                    TreeNode a=arr.get(i);
                    TreeNode b=arr.get(arr.size()-1-i);
                    int temp=a.val;
                    a.val=b.val;
                    b.val=temp;

    
                }
                
            }
        }
        return root;

    }
}
class Pair
{
    int lev;
    TreeNode t;
    Pair(int lev,TreeNode t)
    {
        this.lev=lev;
        this.t=t;
    }
}