// Last updated: 02/09/2026, 13:58:47
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length, n = board[0].length;
4        if (m*n < word.length())
5            return false;
6        char[] wrd = word.toCharArray();
7        int[] boardf = new int[128];
8        for (int i = 0; i < m; ++i)
9        {
10            for (int j = 0; j < n; ++j)
11            {
12                ++boardf[board[i][j]];
13            }
14        }
15        for (char ch : wrd)
16        {
17            if (--boardf[ch] < 0)
18            {
19                return false;
20            }
21        }
22        if (boardf[wrd[0]] > boardf[wrd[wrd.length - 1]])
23            reverse(wrd);
24        for (int i = 0; i < m; ++i)
25        {
26            for (int j = 0; j < n; ++j)
27            {
28                if (wrd[0] == board[i][j]
29                    && found(board, i, j, wrd, new boolean[m][n], 0))
30                    return true;
31            }
32        }
33        return false;
34    }
35
36    private void reverse(char[] word)
37    {
38        int n = word.length;
39        for (int i = 0; i < n/2; ++i)
40        {
41            char temp = word[i];
42            word[i] = word[n - i - 1];
43            word[n - i - 1] = temp;
44        }
45    }
46    private static final int[] dirs = {0, -1, 0, 1, 0};
47    private boolean found(char[][] board, int row, int col, char[] word,
48                        boolean[][] visited, int index)
49    {
50        if (index == word.length)
51            return true;
52        if (row < 0 || col < 0 || row == board.length || col == board[0].length
53            || board[row][col] != word[index] || visited[row][col])
54            return false;
55        visited[row][col] = true;
56        for (int i = 0; i < 4; ++i)
57        {
58            if (found(board, row + dirs[i], col + dirs[i + 1],
59                word, visited, index + 1))
60                return true;
61        }
62        visited[row][col] = false;
63        return false;
64    }
65}