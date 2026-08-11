// Last updated: 11/08/2026, 11:37:57
class Solution {
    public int pivotInteger(int n) {
        int sum= n*(n+1)/2;
        double a= Math.sqrt(sum);

        if( a- Math.ceil(a)==0) return (int)a;
        else return -1;
    }
}