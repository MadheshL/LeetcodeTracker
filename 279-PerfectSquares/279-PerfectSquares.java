// Last updated: 11/08/2026, 11:40:14
// class Solution {
//     public int numSquares(int n) {
//         if (n == 0)
//             return 0;

//         int ans = Integer.MAX_VALUE;

//         for (int i = 1; i * i <= n; i++) {
//             ans = Math.min(ans, 1 + numSquares(n - i * i));
//         }

//         return ans;
//     }
// }

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];

        // Initialize with maximum possible value
        for (int i = 0; i <= n; i++) {
            dp[i] = i; // Worst case: all 1's
        }

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}