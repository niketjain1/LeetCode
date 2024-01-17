class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length(), m = magazine.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++ ) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (int i = 0; i < m; i++ ) {
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
        }  

        for (int i = 0; i < n; i++) {
            int value2 = 0;
            int value1 = map1.get(ransomNote.charAt(i));
            if (map2.containsKey(ransomNote.charAt(i))) {
                value2 = map2.get(ransomNote.charAt(i));
            }
            if (value1 > value2) {
                return false;
            }
        }
        return true;
    }
}