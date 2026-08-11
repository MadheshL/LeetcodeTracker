// Last updated: 11/08/2026, 11:37:54
class Solution {
    public static int[] leftRightDifference(int[] nums) {        
    	int n =  nums.length;
    	int ans[] = new int[n];
    	int total = 0;
    	int leftSum = 0;
    	for (int i = 0; i < n; i++) {
			total += nums[i];
		}
    	for (int i = 0; i < n; i++) {
    		int rightSum = total - leftSum - nums[i];
    		ans[i] =  Math.abs(leftSum-rightSum);
    		leftSum += nums[i];
		}
    	return ans;
    }
}