// Last updated: 02/09/2026, 11:14:53
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5
6        int left = 1;
7        for (int i = 0; i < n; i++) {
8            answer[i] = left;
9            left = left * nums[i];
10        }
11        int right = 1;
12        for (int i = n - 1; i >= 0; i--) {
13            answer[i] = answer[i] * right;
14            right = right * nums[i];
15        }
16        return answer;
17        
18    }
19}