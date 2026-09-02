// Last updated: 02/09/2026, 12:30:11
1class MedianFinder {
2
3    private PriorityQueue<Integer> lowerHalf;
4    private PriorityQueue<Integer> upperHalf;
5    public MedianFinder() {
6        lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
7        upperHalf = new PriorityQueue<>();
8    }
9    public void addNum(int num) {
10        if (lowerHalf.isEmpty() || num <= lowerHalf.peek()) {
11            lowerHalf.offer(num);
12        } else {
13            upperHalf.offer(num);
14        }
15                if (lowerHalf.size() > upperHalf.size() + 1) {
16            upperHalf.offer(lowerHalf.poll());
17        } else if (upperHalf.size() > lowerHalf.size()) {
18            lowerHalf.offer(upperHalf.poll());
19        }
20    }
21
22    public double findMedian() {
23        if (lowerHalf.size() > upperHalf.size()) {
24            return lowerHalf.peek();
25        }
26        return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
27        
28    }
29}
30
31/**
32 * Your MedianFinder object will be instantiated and called as such:
33 * MedianFinder obj = new MedianFinder();
34 * obj.addNum(num);
35 * double param_2 = obj.findMedian();
36 */