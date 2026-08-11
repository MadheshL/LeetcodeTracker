// Last updated: 11/08/2026, 11:41:18
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.print(nums);
        for(int x:nums){
            //System.out.print(x +" ");
        }
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
    }
}