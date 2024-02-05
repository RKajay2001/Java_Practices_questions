package stack;

import java.util.Stack;

public class StringReversalWithStack {

    public static void main(String[] args) {
        // Input string
        String inputString = "Hello, World!";

        // Reversing the string
        String reversedString = reverseString(inputString);

        // Displaying the original and reversed strings
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    // Function to reverse a string using a stack
    public static String reverseString(String input) {
        Stack<Character> charStack = new Stack<>();

        // Pushing each character onto the stack
        for (char c : input.toCharArray()) {
            charStack.push(c);
        }

        // Pop characters from the stack to build the reversed string
        StringBuilder reversedStringBuilder = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedStringBuilder.append(charStack.pop());
        }

        return reversedStringBuilder.toString();
    }
}

