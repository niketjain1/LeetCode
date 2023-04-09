class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' && !stk.isEmpty() && stk.peek() == '('){
                stk.pop();
            }else if(s.charAt(i) == ']' && !stk.isEmpty() && stk.peek() == '['){
                stk.pop();
            }else if(s.charAt(i) == '}' && !stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        return stk.isEmpty();
    }
}