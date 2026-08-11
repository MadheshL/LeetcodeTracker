// Last updated: 11/08/2026, 11:39:28
class Solution {
    public int pivotIndex(int[] nums) {
        int totalWeightOnLeft = 0;
        int totalWeightOnRight = IntStream.of( nums ).sum();
        for( int i = 0 ; i < nums.length ; i++ ){
            int curWeight = nums[i];
            totalWeightOnRight -= curWeight;
            if( totalWeightOnLeft == totalWeightOnRight ){
                return i;
            }
            totalWeightOnLeft  += curWeight;
        }
        return -1;
    }
}