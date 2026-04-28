package collections;

import java.util.HashSet;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
