// Last updated: 02/09/2026, 14:02:43
1class Solution {
2    public void flatten(TreeNode root) {
3        if (root == null) return;
4        List<TreeNode> nodes = new ArrayList<>();
5        preorder(root, nodes);
6
7        for (int i = 0; i < nodes.size() - 1; i++) {
8            nodes.get(i).left = null;
9            nodes.get(i).right = nodes.get(i + 1);
10        }
11    }
12
13    private void preorder(TreeNode node, List<TreeNode> nodes) {
14        if (node == null) return;
15        nodes.add(node);
16        preorder(node.left, nodes);
17        preorder(node.right, nodes);
18    }
19}
20