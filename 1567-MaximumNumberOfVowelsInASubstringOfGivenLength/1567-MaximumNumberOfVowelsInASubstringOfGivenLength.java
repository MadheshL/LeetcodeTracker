// Last updated: 11/08/2026, 11:38:42
class Solution {

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {

        int count = 0;

        // first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        // slide window
        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) count++;        // add new char
            if (isVowel(s.charAt(i - k))) count--;    // remove old char

            max = Math.max(max, count);
        }

        return max;
    }
}