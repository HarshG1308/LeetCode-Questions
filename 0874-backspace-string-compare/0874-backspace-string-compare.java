class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = buildStack(s);
        Stack<Character> stackT = buildStack(t);
        return stackS.equals(stackT);
    }

    private Stack<Character> buildStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return stack;
    }
}