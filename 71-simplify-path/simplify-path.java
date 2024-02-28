class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < str.length; i++) {
           if (!stk.empty() && str[i].equals("..")) {
                stk.pop();
            } else if (!str[i].equals(".") && !str[i].equals("") && !str[i].equals("..")) {
                stk.push(str[i]);
            }
        }
        List<String> list = new ArrayList(stk);
        return "/" + String.join("/", list);
    }
}