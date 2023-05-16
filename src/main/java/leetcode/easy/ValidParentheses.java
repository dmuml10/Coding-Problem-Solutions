package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        boolean result = true;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                Character c = stack.pop();
                if (c != getBracket(s.charAt(i))) {
                    result = false;
                    break;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) result = false;
        return result;
    }

    private char getBracket(char c) {
        return switch (c) {
            case ')' -> '(';
            case '}' -> '{';
            case ']' -> '[';
            default -> '-';
        };
    }

}
