// Last updated: 11/08/2026, 11:39:10
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }  
        int i = 0 ; 
        int j = nums.length - 1 ;
        int k = nums.length - 1 ;
        int[] ans = new int[nums.length];
        while(i <= j){
            if(nums[i] >= nums[j]){
                ans[k] = nums[i];
                i++;
            }else if(nums[i] < nums[j]){
                ans[k] = nums[j];
                j--;
            }
            k--;
        }
        return ans ;
    }
}