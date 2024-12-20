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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
       if(depth==1)
            {
                TreeNode n=new TreeNode();
                n.val=val;
                n.left=root;
                n.right=null;
                //root=n;
                return n;
            }
            dfs(root,val,depth,1,'l');
       return root;
    
    }

    void dfs(TreeNode root,int val,int depth,int curdepth,char hint)
    {
        if(root==null)
        return ;
        if(curdepth==depth-1)
        {
                TreeNode n=new TreeNode();
                n.left=root.left;
                n.right=null;
                n.val=val;
                root.left=n;
                TreeNode m=new TreeNode();
                m.right=root.right;
                m.left=null;
                m.val=val;
                root.right=m;
                return;  
        }
         dfs(root.left,val,depth,curdepth+1,'l');
         dfs(root.right,val,depth,curdepth+1,'r');
    }
}