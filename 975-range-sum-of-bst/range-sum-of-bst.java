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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        solve(root,low,high);
        return sum;
    }

    void solve(TreeNode root, int low, int high)
    {
        if(root==null)
        return ;
        if(root.val>=low && root.val<=high)
        {
            sum=sum+root.val;
        }
        solve(root.left,low,high); solve(root.right,low,high);
    }
}