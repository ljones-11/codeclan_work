package org.example;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[]args){
        HashMap<String, Integer> ages = new HashMap<>();

//        favouriteFruits.put("Alice", "Apple");
//        favouriteFruits.put("Bessy", "Banana");
//        favouriteFruits.put("Ollie", "Orange");
//        System.out.println(favouriteFruits.get("Bessy"));

        ages.put("Alice", 22);
        ages.put("Bessy", 23);
        ages.put("Ollie", 19);
        ages.put("Austin",2);


        String aliceAge = ages.keySet().toString();

        String output = "Alice's age is " + aliceAge.toString();
        System.out.println(output);

    }
}
