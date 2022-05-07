package Day_2;

import java.util.Stack;

// URL : https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()) {
            if( (!stk.isEmpty()) &&
                    ((ch == ')' && stk.peek() == '(') ||
                            (ch == '}' && stk.peek() == '{') ||
                            (ch == ']' && stk.peek() == '[')))
                stk.pop();
            else if(ch == '(' || ch == '[' || ch == '{')
                stk.push(ch);
            else return false;
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}
