class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i < n && j < m) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if (i < n) {
            while (i < n) {
                sb.append(word1.charAt(i));
                i++;
            }
        } else if (j < m) {
            while(j < m) {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}