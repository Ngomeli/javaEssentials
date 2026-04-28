package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        System.out.println("Fruits: "+fruits);
    }
}
