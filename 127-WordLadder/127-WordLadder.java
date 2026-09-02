// Last updated: 02/09/2026, 12:33:39
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> wordSet = new HashSet<>(wordList);
4        if (!wordSet.contains(endWord)) {
5            return 0;
6        }
7        Queue<String> wordQueue = new LinkedList<>();
8        wordQueue.add(beginWord);
9        int distance = 1;
10        while (!wordQueue.isEmpty()) {
11            int size = wordQueue.size();
12            for (int i = 0; i < size; i++) {
13                String currWord = wordQueue.poll();
14                if (currWord.equals(endWord)) {
15                    return distance;
16                }
17                for (int j = 0; j < currWord.length(); j++) {
18                    char[] temp = currWord.toCharArray();
19                    for (char c = 'a'; c <= 'z'; c++) {
20                        temp[j] = c;
21                        String newWord = new String(temp);
22                        if (wordSet.contains(newWord)) {
23                            wordQueue.add(newWord);
24                            wordSet.remove(newWord); 
25                        }
26                    }
27                }
28            }
29            distance++;
30        }
31        return 0;
32    }
33}