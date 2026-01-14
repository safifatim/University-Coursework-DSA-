class StackLinkedList {
    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int count;

    // Constructor
    public StackLinkedList() {
        top = null;
        count = 0;
    }

    // Push
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        count++;
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        count--;
        return value;
    }

    // Check empty
    public boolean isEmpty() {
        return top == null;
    }

    // Find Average (PROPER METHOD)
    public double findAverage() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Average = 0");
            return 0;
        }

        int sum = 0;
        Node temp = top;

        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }

        return (double) sum / count;
    }

    // Print stack
    public void printStack() {
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);

        stack.printStack();
        System.out.println("Average: " + stack.findAverage());
    }
}//import java.util.ArrayList;
//import java.util.List;
//
//class Stack_LinkedList {
//
//    public static int findSum(List<Integer> list) {
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        int sum = findSum(list);
//
//        System.out.println("Stack: " + list);
//        System.out.println("Sum = " + sum);
//    }
//}
//



//class StackArray {
//    private int[] stack;
//    private int top;
//
//    // Constructor
//    public StackArray(int size) {
//        stack = new int[size];
//        top = -1;
//    }
//
//    // Push element
//    public void push(int value) {
//        if (top == stack.length - 1) {
//            resize();
//        }
//        stack[++top] = value;
//        System.out.println(value + " pushed to stack");
//    }
//
//    // Pop element
//    public int pop() {
//        if (isEmpty()) {
//            System.out.println("Stack Underflow! Cannot pop.");
//            return -1;
//        }
//        return stack[top--];
//    }
//
//    // Peek top element
//    public int peek() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty! Nothing to peek.");
//            return -1;
//        }
//        return stack[top];
//    }
//
//    // Resize stack (internal use only)
//    private void resize() {
//        int[] newStack = new int[stack.length * 2];
//        for (int i = 0; i < stack.length; i++) {
//            newStack[i] = stack[i];
//        }
//        stack = newStack;
//        System.out.println("Stack resized to " + stack.length);
//    }
//
//    // Check if stack is empty
//    public boolean isEmpty() {
//        return top == -1;
//    }
//
//    // Print stack
//    public void printStack() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//            return;
//        }
//        System.out.print("Stack elements: ");
//        for (int i = top; i >= 0; i--) {
//            System.out.print(stack[i] + " ");
//        }
//        System.out.println();
//    }
//}
//
//public class Stack_LinkedList {
//    public static void main(String[] args) {
//
//        StackArray stack = new StackArray(5);
//
//        stack.push(2);
//        stack.push(4);
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//
//        System.out.println("Popped: " + stack.pop());
//        System.out.println("Top element: " + stack.peek());
//
//        stack.printStack();
//        System.out.println("Is stack empty? " + stack.isEmpty());
//    }
//}
