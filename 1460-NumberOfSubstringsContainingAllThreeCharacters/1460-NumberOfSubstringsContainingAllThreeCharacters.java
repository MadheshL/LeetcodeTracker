// Last updated: 11/08/2026, 11:38:55
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3];
        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += (n - right);
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }
}
// class Solution {
//     public int numberOfSubstrings(String s) {
//         int n = s.length();
//         int ans = 0;

//         for (int i = 0; i < n; i++) {
//             boolean a = false, b = false, c = false;

//             for (int j = i; j < n; j++) {
//                 char ch = s.charAt(j);

//                 if (ch == 'a') a = true;
//                 else if (ch == 'b') b = true;
//                 else if (ch == 'c') c = true;

//                 if (a && b && c) {
//                     ans++;
//                 }
//             }
//         }

//         return ans;
//     }
// }