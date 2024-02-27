class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == ')' && !stk.isEmpty() && stk.peek() == '(') {
                stk.pop();
            } else if (c == ']' && !stk.isEmpty() && stk.peek() == '[') {
                stk.pop();
            } else if (c == '}' && !stk.isEmpty() && stk.peek() == '{') {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}