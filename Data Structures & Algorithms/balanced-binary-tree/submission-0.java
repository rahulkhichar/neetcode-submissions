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
   class Piar {
    int height;
    boolean isBalaced;
    Piar(int height,boolean isBalaced) {
        this.height = height;
        this.isBalaced = isBalaced;
    }


    }

    public Piar height(TreeNode root) {
        if(root == null) return  new Piar(0,true);

        Piar left = height(root.left);
        Piar right = height(root.right);
        
        if(left.isBalaced &&  right.isBalaced && Math.abs(left.height-right.height) <=1) {
            return new Piar(Math.max(left.height,right.height)+1,true);
        }

            return new Piar(Math.max(left.height,right.height)+1,false);
    }
    public boolean isBalanced(TreeNode root) {
        Piar p = height(root);

        return p.isBalaced;
    }
}
