package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("Have Banana? "+fruits.contains("Banana"));

        fruits.remove("Banana");
        System.out.println("Number of elements after removing lemon: "+fruits.size());

        Set moreFruit = Set.of("Cherry", "CashewNuts", "Watermelon");
        System.out.println(moreFruit);
    }
}
