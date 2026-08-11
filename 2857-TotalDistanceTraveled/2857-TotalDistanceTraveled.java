// Last updated: 11/08/2026, 11:37:42
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
    int dis=0;
        while(mainTank>=5 && additionalTank>0){
            mainTank-=5;
            dis+=50;
            additionalTank--;
            mainTank++;
        }
        dis+=mainTank*10;
        return dis;    
    }
}