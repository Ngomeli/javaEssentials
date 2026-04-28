package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("Pineapple", 80);
        fruitCalories.put("Orange", 45);
        fruitCalories.put("Banana", 105);
       // fruitCalories.put("Pineapple", 40);//overrides existing value
        fruitCalories.putIfAbsent("Pineapple", 40);

        System.out.println("Fruits: "+fruitCalories);

    }
}
