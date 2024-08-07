package collections;

import java.util.LinkedList;

class Order {
    private int id;
    private String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order #" + id + ": " + description;
    }
}

public class LinkedListExample {
    private LinkedList<Order> orderQueue = new LinkedList<>();

    public void addOrder(Order order) {
        orderQueue.addLast(order);
    }

    public Order processNextOrder() {
        return orderQueue.pollFirst();
    }

    public static void main(String[] args) {
        LinkedListExample processor = new LinkedListExample();
        processor.addOrder(new Order(1, "Order for a laptop"));
        processor.addOrder(new Order(2, "Order for a smartphone"));

        System.out.println("Processing: " + processor.processNextOrder());
        System.out.println("Processing: " + processor.processNextOrder());
    }
}

