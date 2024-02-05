package stack;

import java.util.EmptyStackException;

public class ImplementingStack {

    public static void main(String[] args) {
        // Creating a stack
        Stack stack = new Stack();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Displaying the elements
        System.out.println("Stack elements: " + stack);

        // Popping elements from the stack
        try {
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty. Cannot pop.");
        }

        // Displaying the elements after popping
        System.out.println("Stack elements after popping: " + stack);
    }

    static class Stack {
        private Node top;

        // Node class representing each element in the stack
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        // Push operation to add an element to the top of the stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        // Pop operation to remove and return the element from the top of the stack
        public int pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            int poppedData = top.data;
            top = top.next;
            return poppedData;
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Display the elements in the stack
        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("[");
            Node current = top;

            while (current != null) {
                result.append(current.data);
                if (current.next != null) {
                    result.append(", ");
                }
                current = current.next;
            }

            result.append("]");
            return result.toString();
        }
    }
}

