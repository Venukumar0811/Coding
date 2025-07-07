class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if (top < arr.length - 1) {
            arr[++top] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        // Your Code
        if (top == -1) {
            return -1; 
        }
        return arr[top--];
    }
}