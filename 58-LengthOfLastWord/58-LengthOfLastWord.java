// Last updated: 11/08/2026, 11:41:31
class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       int length=0;

       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
            length++;
        }
        else if(length >0){
            break;
        }
       }
       return length;
    }
}