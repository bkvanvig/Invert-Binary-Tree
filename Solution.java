/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode r = root.right;
        TreeNode l = root.left;
        root.right = l;
        root.left = r;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}