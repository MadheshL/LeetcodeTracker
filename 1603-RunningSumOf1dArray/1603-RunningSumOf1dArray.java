// Last updated: 11/08/2026, 11:38:39
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i =1; i<nums.length ; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}