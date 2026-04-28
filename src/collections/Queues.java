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
        fruits.add("Pineapple");
        var removed = fruits.remove();

        System.out.println("Fruits: "+fruits);
        System.out.println("Removed: "+removed);
        System.out.println("head of queue:" + fruits.peek());
    }
}
