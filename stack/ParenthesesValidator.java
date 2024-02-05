package stack;

import java.util.Stack;

public class ParenthesesValidator {

    public static void main(String[] args) {
        // Example expressions to test
        String expression1 = "{[()]()}";
        String expression2 = "{[(])}";
        String expression3 = "((()))";

        // Testing expressions
        System.out.println("Expression 1 is valid: " + isValid(expression1));
        System.out.println("Expression 2 is valid: " + isValid(expression2));
        System.out.println("Expression 3 is valid: " + isValid(expression3));
    }

    // Function to validate parentheses in an expression
    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Opening parentheses, push onto the stack
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                // Closing parenthesis matching with the top of the stack
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                // Closing curly brace matching with the top of the stack
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                // Closing square bracket matching with the top of the stack
                stack.pop();
            } else {
                // Invalid closing parenthesis encountered
                return false;
            }
        }

        // The expression is valid if the stack is empty at the end
        return stack.isEmpty();
    }
}

