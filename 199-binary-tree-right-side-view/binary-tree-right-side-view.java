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
    int visited =-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }
    public void view(TreeNode root,int curr ,List<Integer>ans){
        if(root==null) return;
        if(curr>visited){
            visited=curr;
            ans.add(root.val);
        }
         view(root.right,curr+1,ans);
         view(root.left,curr+1,ans);
    }
}