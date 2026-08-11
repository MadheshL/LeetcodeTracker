// Last updated: 11/08/2026, 11:38:26
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int Dn = 2 * n;
        int[] result = new int[Dn];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }
}