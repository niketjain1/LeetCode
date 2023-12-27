class Solution {
    public int countWords(String[] words1, String[] words2) {
        int n = words1.length;
        int m = words2.length;
        HashMap<String, Integer> map = new HashMap();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(words1[i])) {
                map.put(words1[i], map.get(words1[i]) + 1);
            } else {
                map.put(words1[i], 1);
            }
        }
        System.out.println(map);
        
        for (int j = 0; j < m; j++) {
            Integer freq = map.get(words2[j]);
            if (freq != null && freq <= 1) {
                map.put(words2[j], map.get(words2[j]) - 1);
            }
        }
        
        for (int value: map.values()) {
            if (value == 0) {
                ans++;
            }
        }
        return ans;
    }
}