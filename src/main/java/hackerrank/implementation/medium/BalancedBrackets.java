package hackerrank.implementation.medium;

import java.util.Stack;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    result = false;
                    break;
                }
                char c = stack.pop();
                switch(s.charAt(i)) {
                    case '}':
                        if (c != '{') {
                            result = false;
                        }
                        break;
                    case ']':
                        if (c != '[') {
                            result = false;
                        }
                        break;
                    case ')':
                        if (c != '(') {
                            result = false;
                        }
                        break;
                    default:
                        break;
                }
                if (!result) {
                    break;
                }
            }
        }

        if (result && stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
      System.out.println(isBalanced("[{"));
    }

}