import java.util.HashMap;
import java.util.Map;

public class hashMap1 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Using values() method
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }
        // Using keySet() and get() method
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap);
        System.out.println(hashMap.get("Two"));
        //Iterating By Map EntrySet
        for(Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
