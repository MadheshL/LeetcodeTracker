// Last updated: 11/08/2026, 11:39:18
class Solution {
    public int search(int[] nums, int target) {
       for (int i=0;i<nums.length;i++) {
        if(nums[i]==target){
            return i;
        }
       }
       return -1;
    }
}