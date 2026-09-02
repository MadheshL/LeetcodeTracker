// Last updated: 02/09/2026, 12:14:45
1class Solution {
2    public int trap(int[] height) {
3        
4        int n = height.length;
5        int totalWater = 0;
6
7        int leftMax = 0;
8        int rightMax = 0;
9
10        int start = 0;
11        int end = n - 1;
12
13        while (start < end) {
14
15            leftMax = Math.max(leftMax, height[start]);
16            rightMax = Math.max(rightMax, height[end]);
17
18            if (leftMax < rightMax) {
19
20                totalWater += leftMax - height[start];
21                start++;
22
23            } else {
24
25                totalWater += rightMax - height[end];
26                end--;
27            }
28        }
29
30        return totalWater;
31    }
32}