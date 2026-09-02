// Last updated: 02/09/2026, 12:08:02
1// class Solution {
2//     public void rotate(int[] nums, int k) {
3//         int n = nums.length;
4//         k = k % n;
5//         for (int i = 0; i < k; i++) {
6//             int last = nums[n - 1];
7//             for (int j = n - 1; j > 0; j--) {
8//                 nums[j] = nums[j - 1];
9//             }
10//             nums[0] = last;
11//         }
12//     }
13// }
14class Solution{
15    public void rotate(int[]nums,int k){
16        int n=nums.length;
17        k%=n;
18        reverse(nums,0,n-1);
19        reverse(nums,0,k-1);
20        reverse(nums,k,n-1);
21    }
22    private void reverse(int[]nums,int start,int end){
23        while(start<end){
24            int temp=nums[start];
25            nums[start]=nums[end];
26            nums[end]=temp;
27            start++;
28            end--;
29        }
30    }
31}