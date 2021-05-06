public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.print();
        queue.enqueue(10);
        queue.print();
        queue.enqueue(20);
        queue.print();
        queue.enqueue(30);
        queue.print();

    }
}
