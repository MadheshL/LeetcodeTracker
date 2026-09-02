// Last updated: 02/09/2026, 14:06:19
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left=0;
4        int right=numbers.length-1;
5        while(left<right){
6            if(numbers[left]+numbers[right]==target){
7                return new int[]{left+1,right+1};
8            }
9            else if(numbers[left]+numbers[right]>target){
10                right--;
11            }
12            else{
13                left++;
14            }
15        }
16        return new int[]{};
17    }
18}