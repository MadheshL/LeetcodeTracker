// Last updated: 02/09/2026, 12:25:20
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        Deque<Integer> q = new ArrayDeque<>();  
4        List<Integer> res = new ArrayList<>();
5        for (int i = 0; i < nums.length; i++) {
6            while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
7                q.removeLast();
8            }
9            q.addLast(i);
10            if (q.getFirst() == i - k) {
11                q.removeFirst();
12            }
13           
14            if (i >= k - 1) {
15                res.add(nums[q.peek()]);
16            }
17        }
18        return res.stream().mapToInt(i->i).toArray();            
19    }
20}