package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    private Map<Integer, String> history = new LinkedHashMap<>();

    public void addAction(int actionId, String actionDescription) {
        history.put(actionId, actionDescription);
    }

    public void listActions() {
        for (Map.Entry<Integer, String> entry : history.entrySet()) {
            System.out.println("Action ID: " + entry.getKey() + ", Description: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        LinkedHashMapExample actionHistory = new LinkedHashMapExample();
        
        actionHistory.addAction(1, "Added new product");
        actionHistory.addAction(2, "Updated product quantity");
        actionHistory.listActions();
    }
}
