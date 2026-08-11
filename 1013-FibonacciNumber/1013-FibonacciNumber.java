// Last updated: 11/08/2026, 11:39:13
class Solution {
    public int fib(int n) {

        int ft = 0, st = 1;

        for(int i = 1; i <= n; i++){
            int tt = ft + st;
            ft = st;
            st = tt;
        }

        return ft;
    }
}