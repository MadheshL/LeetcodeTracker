// Last updated: 02/09/2026, 13:45:47
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), ans);
5        return ans;
6    }
7
8    private void backtrack(int[] arr, int remain, int idx, List<Integer> path, List<List<Integer>> ans) {
9        if (remain == 0) {
10            ans.add(new ArrayList<>(path));
11            return;
12        }
13        if (idx == arr.length || remain < 0) return;
14        path.add(arr[idx]);
15        backtrack(arr, remain - arr[idx], idx, path, ans);
16        path.remove(path.size() - 1);
17        backtrack(arr, remain, idx + 1, path, ans);
18    }
19}