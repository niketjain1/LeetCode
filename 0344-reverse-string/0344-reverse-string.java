class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        // for(int i = s.length - 1; i >= 0; i--){
        //     sb.concat(s[i]);
        // }
        for(int i = 0; i < sb.length(); i++){
            s[i] = sb.charAt(i);
        }
        return;
    }
}