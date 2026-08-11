// Last updated: 11/08/2026, 11:42:01
class Solution {
    public boolean isPalindrome(int x) {
          if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
} 