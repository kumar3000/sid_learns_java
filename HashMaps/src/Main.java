import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        // map.remove("apple");
        System.out.println(map.get("coconut"));
        System.out.println(map.containsKey("goat"));
        if (map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Apple does not exist!");
        }

        System.out.println(map.containsValue(1.0));
        System.out.println(map.size());
        for (String key : map.keySet()) {
            System.out.printf("%s: $%.2f\n", key, map.get(key));
        }
    }
}
