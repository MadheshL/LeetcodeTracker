// Last updated: 11/08/2026, 11:40:52
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result ^=num;
        }
         return result;
    }
   
}