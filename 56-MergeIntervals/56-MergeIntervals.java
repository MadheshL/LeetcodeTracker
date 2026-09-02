// Last updated: 02/09/2026, 11:08:07
1class Solution {
2    public int[][] merge(int[][] intervals) {
3   
4        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
5
6        int[][] result = new int[intervals.length][2];
7        int count = 0;
8
9        result[0] = intervals[0];
10
11        for (int i = 1; i < intervals.length; i++) {
12
13            if (intervals[i][0] <= result[count][1]) {
14                result[count][1] =
15                    Math.max(result[count][1], intervals[i][1]);
16            } 
17            else {
18                count++;
19                result[count] = intervals[i];
20            }
21        }
22
23        return Arrays.copyOf(result, count + 1);
24    }
25}