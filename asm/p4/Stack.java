package DSA.asm.p4;
class Stack {
    private int top;
    private String[] array;
    public Stack(int capacity) {
        this.top = -1;
        this.array = new String[capacity];
    }
    public boolean isFull() {
        return this.top == this.array.length - 1;
    }
    public boolean isEmpty() {
        return this.top == -1;
    }
    public void push(String item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        this.array[++this.top] = item;
    }
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return this.array[this.top--];
    }
}

