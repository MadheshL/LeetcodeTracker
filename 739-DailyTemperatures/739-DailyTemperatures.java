// Last updated: 02/09/2026, 11:25:53
1// class Solution {
2//     public int[] dailyTemperatures(int[] temps) {
3
4//         int n = temps.length;
5//         int[] result = new int[n];
6
7//         for (int i = 0; i < n; i++) {
8
9//             for (int j = i + 1; j < n; j++) {
10
11//                 if (temps[j] > temps[i]) {
12//                     result[i] = j - i;
13//                     break;
14//                 }
15//             }
16//         }
17
18//         return result;
19//     }
20// }
21class Solution {
22    public int[] dailyTemperatures(int[] temps) {
23
24        int n = temps.length;
25        int[] result = new int[n];
26
27        int[] stack = new int[n];
28        int top = -1;
29
30        for (int i = 0; i < n; i++) {
31
32            while (top >= 0 && temps[stack[top]] < temps[i]) {
33
34                int index = stack[top];
35                top--;
36
37                result[index] = i - index;
38            }
39
40            top++;
41            stack[top] = i;
42        }
43
44        return result;
45    }
46}