package collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambdas {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
    }
}
