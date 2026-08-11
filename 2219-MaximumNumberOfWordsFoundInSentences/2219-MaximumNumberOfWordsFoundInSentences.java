// Last updated: 11/08/2026, 11:38:17
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            int words = 1;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    words++;
                }
            }
            maxWords = Math.max(maxWords, words);
        }
        return maxWords;
    }
}