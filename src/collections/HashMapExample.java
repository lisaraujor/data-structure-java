package collections;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {

    private Map<String, Integer> inventory = new HashMap<>();

    public void addItem(String item, int quantity) {
        inventory.put(item, quantity);
    }

    public int getItemQuantity(String item) {
        return inventory.getOrDefault(item, 0);
    }

    public void listItems() {
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        
        HashMapExample manager = new HashMapExample();
        
        manager.addItem("Laptop", 50);
        manager.addItem("Smartphone", 100);
        manager.listItems();
    }
}

