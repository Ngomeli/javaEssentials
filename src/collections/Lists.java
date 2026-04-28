package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("watermelon");
        fruits.set(2, "Mango");
        fruits.add("banana");
        fruits.remove(4);

        System.out.println("Fruits: "+fruits);
        System.out.println(fruits.get(2));
        System.out.println("index of first banana: "+fruits.indexOf("banana"));
        System.out.println("index of last banana: "+fruits.lastIndexOf("banana"));
    }
}
