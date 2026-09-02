// Last updated: 02/09/2026, 11:34:29
1class Solution {
2
3    public boolean isValid(String s) {
4
5        char[] arr = s.toCharArray();
6
7        Stack<Character> st = new Stack<>();
8
9        for (int i = 0; i < arr.length; i++) {
10
11            char ch = arr[i];
12
13            if (ch == '(' ||
14                ch == '{' ||
15                ch == '[') {
16
17                st.push(ch);
18
19            } else {
20
21                if (st.isEmpty()) {
22
23                    return false;
24                }
25                char top = st.pop();
26                if ((ch == ')' && top != '(') ||
27                    (ch == '}' && top != '{') ||
28                    (ch == ']' && top != '[')) {
29
30                    return false;
31                }
32            }
33        }
34        return st.isEmpty();
35    }
36}