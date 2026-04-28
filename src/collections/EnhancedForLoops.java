package collections;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Mango");
        fruits.add("Orange");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
