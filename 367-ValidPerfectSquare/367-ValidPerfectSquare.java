// Last updated: 11/08/2026, 11:39:59
class Solution {
    public boolean isPerfectSquare(long num) {
        for (long i=1;i*i<=num;i++){
            if(i*i== num){
                return true;
            }
          
        }
      return false;  
    }
}