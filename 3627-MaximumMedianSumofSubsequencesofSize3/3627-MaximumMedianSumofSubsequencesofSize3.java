// Last updated: 02/09/2026, 14:18:21
1class Solution {
2    public long maximumMedianSum(int[] nums) {
3        Arrays.sort(nums);
4        long r = 0;
5        int n = nums.length;
6        int d = n / 3;
7        for (int i = d; i < n; i += 2) {
8            r += (long) nums[i];
9        }
10        return r;
11    }
12}