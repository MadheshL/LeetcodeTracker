// Last updated: 02/09/2026, 13:55:45
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(nums, 0, new ArrayList<>(), result);
5        return result;
6    }
7    
8    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
9        result.add(new ArrayList<>(path));
10        for (int i = start; i < nums.length; i++) {
11            path.add(nums[i]);
12            backtrack(nums, i + 1, path, result);
13            path.remove(path.size() - 1);
14        }
15    }
16}