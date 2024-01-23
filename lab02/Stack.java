public class Stack {
    private static final int MAX_SIZE = 100;
    private int[] array;
    private int top;

    public Stack() {
        array = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
        } else {
            array[++top] = value;
            System.out.println(value + " pushed to the stack.");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
        } else {
            System.out.println(array[top--] + " popped from the stack.");
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception indicating stack underflow
        } else {
            return array[top];
        }
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
