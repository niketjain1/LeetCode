class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if (n != m) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < m; j++) {
            map.put(t.charAt(j), map.getOrDefault(t.charAt(j), 0) - 1);
        }

        for (int k: map.values()) {
            if (k != 0) {
                return false;
            }
        }
        return true;
    }
}