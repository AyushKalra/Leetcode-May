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
    int monitoredNoCam = 1;
    int monitoredCam = 2;
    int notMonitored = 3;
    int res = 0;
    
    
    public int minCameraCover(TreeNode root) {
        int d = dfs(root);
        if(d==notMonitored ) res++;
        return res;
        
    }
    
    private int dfs(TreeNode root){
        if(root == null) {
            return monitoredNoCam;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        if(l==notMonitored || r==notMonitored){
            res++;
            return monitoredCam;
        }else if(l==monitoredCam || monitoredCam == r){
            return monitoredNoCam;
        }else{
            return notMonitored;
        }
    }
    

    
    
    
}