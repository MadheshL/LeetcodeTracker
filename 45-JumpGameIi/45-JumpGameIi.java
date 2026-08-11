// Last updated: 11/08/2026, 11:41:34
class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i=0;i<nums.length -1;i++){
            farthest = Math.max(farthest,i+nums[i]);

            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}