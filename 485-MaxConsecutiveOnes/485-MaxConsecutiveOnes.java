// Last updated: 11/08/2026, 11:39:45
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0, ans = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(count, ans);
        }

        return ans;
    }
}