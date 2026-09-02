// Last updated: 02/09/2026, 14:16:54
1class Solution {
2    public long minOperationsToMakeMedianK(int[] nums, int k) {
3        Arrays.sort(nums);
4        int len=nums.length;
5        long ans=0;
6        for(int i=0;i<len;i++){
7            if(i<len/2 && nums[i]>k)
8            {
9                ans=ans+(nums[i]-k);
10            }
11            else if(i>len/2 && nums[i]<k)
12            {
13                 ans=ans+(k-nums[i]);
14            }
15        }
16        ans=ans+(Math.abs(k-nums[nums.length/2]));
17        return ans;
18        
19    }
20}