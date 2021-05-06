public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.print();
        System.out.println(queue.empty());
        queue.enqueue(10);
        queue.print();
        queue.enqueue(20);
        queue.print();
        queue.enqueue(30);
        queue.print();
        System.out.println(queue.peek());
        queue.empty();
        System.out.println(queue.empty());
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        //System.out.println(queue.peek());
        queue.enqueue(30);
        queue.print();
    }
}
