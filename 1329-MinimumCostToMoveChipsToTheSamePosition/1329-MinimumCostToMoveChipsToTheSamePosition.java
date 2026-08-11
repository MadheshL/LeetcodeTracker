// Last updated: 11/08/2026, 11:39:06
class Solution {
    public int minCostToMoveChips(int[] position) {
         int size = position.length;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < size; i++) {
            if (position[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        return Math.min(odd, even);
    }
}