package collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");

        System.out.println(hashSet); // Output: [Apple, Banana]

        boolean hasApple = hashSet.contains("Apple");
        System.out.println("Contains Apple? " + hasApple); // True

        hashSet.remove("Cherry");
        System.out.println(hashSet);

    }
}

