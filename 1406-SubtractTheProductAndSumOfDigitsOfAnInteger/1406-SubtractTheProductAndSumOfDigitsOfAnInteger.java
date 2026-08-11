// Last updated: 11/08/2026, 11:39:00
class Solution {
    public int subtractProductAndSum(int n) {
        int result;
        int add =0;
        int mul=1;
        while(n>0){
            int lastDigit = n %10;
            n = n/10;
            add = add + lastDigit;
            mul = mul * lastDigit;
        }
        result = mul - add;
return result;
    }
    
}