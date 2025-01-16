package Lecture7;

import java.util.HashMap;

public class exercise1 {
    public static void main(String[] args) {
        HashMap<String, Integer> storeInventory = new HashMap<>();
        storeInventory.put("Tomato", 100);
        storeInventory.put("Cucumber", 200);
        storeInventory.put("Onion", 50);
        storeInventory.put("Lettuce", 100);

        System.out.println("What is the quantity of tomatoes? - " + storeInventory.get("Tomato"));


        boolean isRestocked = storeInventory.replace("Lettuce", storeInventory.get("Lettuce"), (storeInventory.get("Lettuce") + 50));

    if (isRestocked){
        System.out.println("Restock lettuce quantity with 50, the new quantity is: " + storeInventory.get("Lettuce"));
    }

    storeInventory.replace("Cucumber", 0);
    for(String key: storeInventory.keySet()){
        if(0 == storeInventory.get(key)){
            System.out.println("The following product is out of stock.");
        }
    }

        storeInventory.remove("Onion");
        System.out.println("Onions available in the stock: " + storeInventory.containsKey("Onion"));
        System.out.println("Print the entire inventory to see the stock levels: " + storeInventory);
    }
}