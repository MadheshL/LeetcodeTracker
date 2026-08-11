// Last updated: 11/08/2026, 11:38:25
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern: patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
}