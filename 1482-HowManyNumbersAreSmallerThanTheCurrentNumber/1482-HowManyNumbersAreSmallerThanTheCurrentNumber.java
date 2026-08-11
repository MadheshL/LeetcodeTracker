// Last updated: 11/08/2026, 11:38:52
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        
        for(int i=0; i<nums.length; i++) {
            buck[nums[i]] +=1;
        }
        
        for(int j=1; j<= 100; j++) {
            buck[j] += buck[j-1];
        }
        
        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : buck[pos-1];
        }
        
        return nums;
    }}