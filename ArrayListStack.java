public class ArrayListStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public ArrayListStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // stack is empty initially
    }

    // Push operation
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Peek (optional: see top element)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        ArrayListStack s = new ArrayListStack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Top element: " + s.peek());
    }
}
