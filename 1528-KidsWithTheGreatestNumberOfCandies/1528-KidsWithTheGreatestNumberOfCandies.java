// Last updated: 11/08/2026, 11:38:45
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
          List<Boolean> candiesArr=new ArrayList();
        for(int i=0;i<candies.length;i++){
            if(candies[i]<(max-extraCandies)){
                candiesArr.add(false);
            }
            else{
                candiesArr.add(true);
            }
        }
        return candiesArr;
    }
}