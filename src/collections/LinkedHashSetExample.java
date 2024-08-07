package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        linkedSet.add("Apple"); // Não será adicionado, pois "Apple" já está no conjunto

        // Imprimindo o LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedSet);

        // Verificando se um elemento está presente
        boolean hasBanana = linkedSet.contains("Banana");
        System.out.println("Contains Banana? " + hasBanana);

        // Removendo um elemento
        linkedSet.remove("Cherry");
        System.out.println("LinkedHashSet after removal: " + linkedSet);
    }
}

