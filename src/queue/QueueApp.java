package queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.push(17);
        queue.push(29);
        queue.push(15);
        queue.push(3);

        System.out.println(queue);

        queue.pop();
        
        System.out.println(queue);

        queue.push(8);
        queue.push(5);

        System.out.println(queue);

        queue.pop();
        queue.pop();

        System.out.println(queue);
    }
}
