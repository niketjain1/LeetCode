class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i = 1, j = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(word1.charAt(0));
        while(i < n && j < m){
            sb.append(word2.charAt(j));
            j++;
            sb.append(word1.charAt(i));
            i++;
        }
        if(i < n){
            while(i < n){
                sb.append(word1.charAt(i));
                i++;
            }
        } else if(j < m) {
            while(j < m){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return new String(sb);
    }
}