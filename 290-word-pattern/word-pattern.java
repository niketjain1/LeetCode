class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(words.length != pattern.length()){
            return false; 
        }
        for(int i = 0; i < words.length; i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(c, words[i]);
            }
        }
        return true;
    }
}