package collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

    private SortedMap<String, Double> prices = new TreeMap<>();

    public void addPrice(String product, double price) {
        prices.put(product, price);
    }

    public void listPrices() {
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    public String getCheapestProduct() {
        return prices.firstKey();
    }

    public String getMostExpensiveProduct() {
        return prices.lastKey();
    }

    public static void main(String[] args) {
        TreeMapExample priceList = new TreeMapExample();
        priceList.addPrice("Laptop", 999.99);
        priceList.addPrice("Smartphone", 699.99);
        priceList.addPrice("Tablet", 299.99);
        priceList.listPrices();

        System.out.println("Cheapest Product: " + priceList.getCheapestProduct());
        System.out.println("Most Expensive Product: " + priceList.getMostExpensiveProduct());
    }
}
