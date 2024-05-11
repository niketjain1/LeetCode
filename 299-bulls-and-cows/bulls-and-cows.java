class Solution {
    public String getHint(String secret, String guess) {
        int countBulls = 0;
        int countCows = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            int c = Integer.valueOf(secret.charAt(i));
            int b = Integer.valueOf(guess.charAt(i));
            if (c == b) {
                countBulls++;
                continue;
            }
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int j = 0; j < guess.length(); j++) {
            int a = Integer.valueOf(guess.charAt(j));
            int c = Integer.valueOf(secret.charAt(j));
            if (a == c) {
                continue;
            }
            if (map.containsKey(a) && map.get(a) > 0) {
                countCows++;
                map.put(a, map.get(a) - 1);
            }
        }
        String ans = new String(countBulls + "A" + countCows + "B");
        return ans;
    }
}