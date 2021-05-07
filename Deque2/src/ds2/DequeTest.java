package ds2;

public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.print();
        deque.enqueue(10);
        deque.print();
        deque.enqueue(20);
        deque.print();
        deque.enqueue(30);
        deque.print();
        deque.enqueueRear(40);
        deque.print();
        deque.dequeueFront();
        deque.print();
    }
}
