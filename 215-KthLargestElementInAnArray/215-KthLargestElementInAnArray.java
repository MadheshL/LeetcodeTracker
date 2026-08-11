// Last updated: 11/08/2026, 11:40:34
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            k--;
            if(k==0) return nums[i];
        }
        return 0;
    }
}