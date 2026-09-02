// Last updated: 02/09/2026, 12:37:27
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4
5        for(int element : nums){
6            map.put(element, map.getOrDefault(element,0)+1);
7        }
8        ArrayList<Map.Entry<Integer,Integer>> arr =
9                new ArrayList<>(map.entrySet());
10        arr.sort((a,b)->b.getValue()-a.getValue());
11        int[] last = new int[k];
12
13        for(int i=0;i<k;i++){
14            last[i]=arr.get(i).getKey();
15        }
16
17        return last;
18    }
19}