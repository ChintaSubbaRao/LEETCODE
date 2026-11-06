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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        } 

        TreeNode root = BT(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);

    return root;
    }

    public TreeNode BT(int[] preorder,int pres,int pree,int[] inorder,int ins,int ine,Map<Integer,Integer> mp){

        if(pres > pree||ins > ine) return null;

        TreeNode root = new TreeNode(preorder[pres]);

        int inRoot = mp.get(root.val);
        int numL = inRoot - ins;

        root.left = BT(preorder,pres + 1,pres + numL,inorder,ins,inRoot - 1,mp);

        root.right = BT(preorder,pres+numL + 1,pree,inorder,inRoot + 1,ine,mp);

    return root;
    }
}