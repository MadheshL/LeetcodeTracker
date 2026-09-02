// Last updated: 02/09/2026, 12:28:10
1class Solution {
2    int ans = Integer.MIN_VALUE;
3    
4    public int maxPathSum(TreeNode root) {
5        helper(root);
6        return ans;
7    }
8
9    int helper(TreeNode node) {
10        if (node == null) return 0;
11
12        int left = Math.max(helper(node.left), 0);
13        int right = Math.max(helper(node.right), 0);
14
15        int pathSum = node.val + left + right;
16        
17        ans = Math.max(ans, pathSum);
18
19        return node.val + Math.max(left, right);
20    }
21}