// Last updated: 11/08/2026, 11:37:39
class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        if(timer ==30)return "Orange";
        if(timer >30 && timer<=90)return "Red";
        return "Invalid";
    }
}