package DSA.asm.p4;
class Queue {
    private int front, rear, size;
    private String[] array;
    public Queue(int capacity) {
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.array = new String[capacity];
    }
    public boolean isFull() {
        return this.size == this.array.length;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        this.rear = (this.rear + 1) % this.array.length;
        this.array[this.rear] = item;
        this.size++;
    }
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        String item = this.array[this.front];
        this.front = (this.front + 1) % this.array.length;
        this.size--;
        return item;
    }
}
