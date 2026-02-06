import java.util.HashMap;
import java.util.Map; // Import Map for entrySet and iteration

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Create a HashMap with String keys and Integer values
        HashMap<String, Integer> studentAges = new HashMap<>();

        // 2. Add elements using the put() method
        studentAges.put("Alice", 20);
        studentAges.put("Bob", 22);
        studentAges.put("Charlie", 19);
        System.out.println("Initial HashMap: " + studentAges); // Output: Initial HashMap: {Bob=22, Alice=20, Charlie=19}

        // 3. Access a value using the get() method
        int bobAge = studentAges.get("Bob");
        System.out.println("Bob's Age: " + bobAge); // Output: Bob's Age: 22

        // 4. Change a value using the put() method (or replace())
        studentAges.put("Bob", 23); // Replaces the old value for key "Bob"
        System.out.println("Updated Bob's Age: " + studentAges.get("Bob")); // Output: Updated Bob's Age: 23

        // 5. Remove an element using the remove() method
        studentAges.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + studentAges); // Output: HashMap after removing Charlie: {Bob=23, Alice=20}

        // 6. Iterate over the HashMap using a for-each loop and entrySet()
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : studentAges.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
