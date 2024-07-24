class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length(), m = s.length();
        int i = 0, j = 0;
        while (j < m && i < n) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                i++;
                continue;
            }
            i++;
        }
        if (j == m) {
            return true;
        } 
        if (i < n) {
            return false;
        }
        return false;
    }
}