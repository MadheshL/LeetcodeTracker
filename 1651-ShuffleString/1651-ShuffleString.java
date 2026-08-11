// Last updated: 11/08/2026, 11:38:29
class Solution {
    public String restoreString(String s, int[] indices) {
    char[] arr = new char[s.length()];
    for(int i=0; i< s.length(); i++){
        arr[indices[i]] = s.charAt(i);
    }
    return new String(arr);
     
    }
}