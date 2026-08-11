// Last updated: 11/08/2026, 11:39:31
class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a=0; a*a<=c;a++){
            long b=(long)Math.sqrt(c - a*a);
            if(a*a + b*b == c){
                return true;
            }
        }
        return false;
    }
}