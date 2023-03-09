class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        findAll("(", 1, 0, n, result);
        
        return result;
    }
    public void findAll(String current, int open, int close, int n, List<String> result){
        
        
        if(current.length() == 2 * n){
            result.add(current);
            return;
        }
        
        if(open < n){
            findAll(current + "(", open + 1, close, n, result);
        }
        if(close < open){
            findAll(current + ")", open, close + 1, n, result);
        }
    }
}