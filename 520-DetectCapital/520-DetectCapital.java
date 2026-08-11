// Last updated: 11/08/2026, 11:39:41
class Solution {
    public boolean detectCapitalUse(String word) {
        int up=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                up++;
            }
        }
        if(up == word.length() || up==0){
            return true;
        }
        if(up == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}