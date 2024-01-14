class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        for (int i = 0; i < Math.min(strs[0].length(), strs[n - 1].length()); i++) {
            if (strs[0].charAt(i) != strs[n - 1].charAt(i)) {
                return sb.toString();
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}