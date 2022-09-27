package collections;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        hashMapWrapperClasses();

    }

    public static void hashMapWrapperClasses() {
        // Define a HashMap
        HashMap<Integer, String> empIds = new HashMap<>();
        System.out.println("Defined HashMap: " + empIds);

        // Add element to map
        empIds.put(111, "John Doe");
        empIds.put(112, "Jane Deer");
        empIds.put(113, "William Smith");
        empIds.put(114, "Jennifer Thompson");
        System.out.println("Added an element to map:");
        printMap(empIds);

        // Get the value using key
        System.out.println("Get the value using key 112: " + empIds.get(112));

        // Check existence by key
        System.out.println("Check if element exists using key 111: " + empIds.containsKey(111));

        // Check existence by value
        System.out.println("Check if element exists using value 'John Doe': " + empIds.containsValue("John Doe"));

        // Update value using key 112
        empIds.put(113, "Emilia Roberts");
        System.out.println("Update value using key 113:");
        printMap(empIds);

        // Delete an element
        empIds.remove(114);
        System.out.println("Removed key-value pair using key 114:");
        printMap(empIds);
    }

    private static void printMap(HashMap<Integer, String> map) {
        map.forEach((key, value) -> {
            System.out.println("key: " + key + " value: " + value);
        });
        System.out.println("");
    }

}
