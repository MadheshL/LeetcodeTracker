// Last updated: 02/09/2026, 12:28:36
1public class Codec {
2    public String serialize(TreeNode root) {
3        if (root == null) return "null";
4
5        StringBuilder sb = new StringBuilder();
6        Queue<TreeNode> q = new LinkedList<>();
7        q.add(root);
8        while (!q.isEmpty()) {
9            TreeNode curr = q.poll();
10            if (curr == null) {
11                sb.append("null,");
12                continue;
13            }
14            sb.append(curr.val).append(",");
15            q.add(curr.left);
16            q.add(curr.right);
17        }
18        return sb.toString();
19    }    public TreeNode deserialize(String data) {
20        if (data.equals("null")) return null;
21        String[] arr = data.split(",");
22        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
23        Queue<TreeNode> q = new LinkedList<>();
24        q.add(root);
25        int i = 1;
26        while (!q.isEmpty() && i < arr.length) {
27            TreeNode curr = q.poll();
28            if (!arr[i].equals("null")) {
29                curr.left = new TreeNode(Integer.parseInt(arr[i]));
30                q.add(curr.left);
31            }
32            i++;
33            if (i < arr.length && !arr[i].equals("null")) {
34                curr.right = new TreeNode(Integer.parseInt(arr[i]));
35                q.add(curr.right);
36            }
37            i++;
38        }
39        return root;
40    }
41}