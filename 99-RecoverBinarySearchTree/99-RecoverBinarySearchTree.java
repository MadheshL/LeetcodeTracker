// Last updated: 24/08/2026, 08:56:32
1
2class Solution {
3    TreeNode prev = null, first = null, second = null;
4
5    public void recoverTree(TreeNode root) {
6        inorder(root);
7
8        int temp = first.val;
9        first.val = second.val;
10        second.val = temp;
11    }
12
13    void inorder(TreeNode root) {
14        if(root == null) return;
15
16        inorder(root.left);
17
18        if(prev != null && root.val < prev.val) {
19            if(first == null) {
20                first = prev;
21            }
22            second = root;
23        }
24
25        prev = root;
26
27        inorder(root.right);
28    }
29} 