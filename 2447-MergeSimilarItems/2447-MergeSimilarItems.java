// Last updated: 11/08/2026, 11:38:09
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], items1[i][1]);
        }

        for (int i = 0; i < items2.length; i++) {
            int key = items2[i][0];
            int val = items2[i][1];

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + val);
            } else {
                map.put(key, val);
            }
        }

        List<List<Integer>> outerList = new ArrayList<>();

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (int key : keys) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(key);
            innerList.add(map.get(key));
            outerList.add(innerList);
        }

        return outerList;
    }
}