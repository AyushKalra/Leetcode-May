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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null )
            return ans;
        Queue <TreeNode> q = new LinkedList<>() ;
        q.offer (root);
        q.offer (null) ;
        
        
        ArrayList <Integer > al   = new ArrayList <> () ;
            
        while ( ! q. isEmpty() ) { 
        TreeNode temp = q.poll() ;
            if ( temp != null ) { 
                al.add ( temp.val ) ;
                
                if (temp.left != null ) 
                    q.offer ( temp.left ) ;
                if (temp.right != null ) 
                    q.offer ( temp.right) ;
                
            }
            else {
             if ( ! q.isEmpty () ) {
               q.offer (null );
                 ans.add ( al ) ;
             al   = new ArrayList <Integer> () ;
               
             } 
                
            } 
        
        } 
         ans.add ( al ) ;
        return ans ;
        
    }
}