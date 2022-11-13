package LeetCode.NeetCode150.Stack;

import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        // Runtime: O(n)
        // Space: O(n)

        // cannot balance odd number of parentheses
        if (s.length() % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                char p = stack.peek();
                if ((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '[' && c == ']')) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
        }

        return stack.isEmpty();
    }
}
