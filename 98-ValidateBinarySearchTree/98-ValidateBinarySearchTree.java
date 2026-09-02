// Last updated: 02/09/2026, 13:59:32
1class Solution {
2    private long minVal = Long.MIN_VALUE;
3    public boolean isValidBST(TreeNode root) {
4        if (root == null) return true; 
5        if (!isValidBST(root.left)) return false;
6        
7        if (minVal >= root.val) return false; 
8
9        minVal = root.val;
10
11        if (!isValidBST(root.right)) return false;
12
13        return true;
14    } 
15}