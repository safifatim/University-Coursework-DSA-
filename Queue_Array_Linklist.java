class Queue {
    int[] arr;
    int front, rear, size;

    // Constructor
    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Enqueue
    public void enqueue(int data) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear++] = data;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return arr[front++];
    }

    // Find maximum element in queue
    public int findMax() {
        int max = Integer.MIN_VALUE;
        while (!isEmpty()) {
            int val = dequeue();
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}

public class Queue_Array_Linklist {
    public static void main(String[] args) {

        Queue q = new Queue(6);

        q.enqueue(12);
        q.enqueue(45);
        q.enqueue(7);
        q.enqueue(89);
        q.enqueue(23);

        int maxElement = q.findMax();
        System.out.println("Maximum element in queue: " + maxElement);
    }
}

//class Queue {
//    int[] arr;
//    int front, rear, size;
//
//    // Constructor
//    Queue(int size) {
//        this.size = size;
//        arr = new int[size];
//        front = 0;
//        rear = 0;
//    }
//
//    // Check if queue is empty
//    public boolean isEmpty() {
//        return front == rear;
//    }
//
//    // Enqueue (insert element)
//    public void enqueue(int data) {
//        if (rear == size) {
//            System.out.println("Queue is full");
//            return;
//        }
//        arr[rear++] = data;
//    }
//
//    // Dequeue (remove element)
//    public int dequeue() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//            return -1;
//        }
//        return arr[front++];
//    }
//
//    // Count total elements in queue
//    public int countElements() {
//        int count = 0;
//        while (!isEmpty()) {
//            dequeue();
//            count++;
//        }
//        return count;
//    }
//}
//
//public class Queue_Array_Linklist{
//    public static void main(String[] args) {
//
//        Queue q = new Queue(5);
//
//        q.enqueue(5);
//        q.enqueue(10);
//        q.enqueue(15);
//        q.enqueue(20);
//        q.enqueue(25);
//
//        int totalElements = q.countElements();
//        System.out.println("Total elements in queue: " + totalElements);
//    }
//}
//

//class Queue {
//    int[] arr;
//    int front, rear, size;
//
//    // Constructor
//    Queue(int size) {
//        this.size = size;
//        arr = new int[size];
//        front = 0;
//        rear = 0;
//    }
//
//    // Check if queue is empty
//    public boolean isEmpty() {
//        return front == rear;
//    }
//
//    // Enqueue (insert element)
//    public void enqueue(int data) {
//        if (rear == size) {
//            System.out.println("Queue is full");
//            return;
//        }
//        arr[rear++] = data;
//    }
//
//    // Dequeue (remove element)
//    public int dequeue() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//            return 0;
//        }
//        return arr[front++];
//    }
//
//    // Find sum of all elements
//    public int findSum() {
//        int sum = 0;
//        while (!isEmpty()) {
//            sum += dequeue();
//        }
//        return sum;
//    }
//}
//
//public class Queue_Array_Linklist {
//    public static void main(String[] args) {
//
//        Queue q = new Queue(5);
//
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//        q.enqueue(40);
//        q.enqueue(50);
//
//        int result = q.findSum();
//        System.out.println("Sum of queue elements: " + result);
//    }
//}
