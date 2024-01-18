class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int n = ransomNote.length(), m = magazine.length();
        int[] characterCount = new int[26];

        for (char c: magazine.toCharArray()) {
            characterCount[c - 'a']++;
            System.out.println( characterCount[c - 'a']);
        }
        for (char c: ransomNote.toCharArray()) {
            if (characterCount[c - 'a'] == 0) {
                return false;
            }
            characterCount[c - 'a']--;
        }

        return true;
    }
}