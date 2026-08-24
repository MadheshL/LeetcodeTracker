// Last updated: 24/08/2026, 08:50:05
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(nums);
8
9        for (int i = 0; i < nums.length - 2; i++) {
10
11            // Skip duplicate first elements
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20                int sum = nums[i] + nums[left] + nums[right];
21
22                if (sum == 0) {
23                    result.add(Arrays.asList(
24                        nums[i], nums[left], nums[right]
25                    ));
26
27                    // Skip duplicates
28                    while (left < right && nums[left] == nums[left + 1]) {
29                        left++;
30                    }
31
32                    while (left < right && nums[right] == nums[right - 1]) {
33                        right--;
34                    }
35
36                    left++;
37                    right--;
38
39                } else if (sum < 0) {
40                    left++;
41                } else {
42                    right--;
43                }
44            }
45        }
46
47        return result;
48    }
49}
50