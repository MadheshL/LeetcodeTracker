// Last updated: 11/08/2026, 11:40:37
public class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1; 
            result = result * 26 + value;
        }

        return result;
    }
}