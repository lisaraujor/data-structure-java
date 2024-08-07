package collections;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

public class ArrayListExample {
    private ArrayList<Product> products = new ArrayList<>();

    // Adicionando um produto
    public void addProduct(Product product) {
        products.add(product);
    }

    // Listando produtos
    public void listProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        ArrayListExample manager = new ArrayListExample();
        manager.addProduct(new Product("Laptop", 999.99));
        manager.addProduct(new Product("Smartphone", 699.99));
        manager.listProducts();
    }
}
