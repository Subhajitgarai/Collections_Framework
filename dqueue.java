import java.util.ArrayDeque;
import java.util.Collection;
import java.util.*;

public class dqueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and rear
        deque.offerFirst("Front Element");
        deque.offerLast("Rear Element");

        // Remove elements from the front and rear
        String frontElement = deque.pollFirst();
        String rearElement = deque.pollLast();

        // Print the elements
        System.out.println("Front Element: " + frontElement);
        System.out.println("Rear Element: " + rearElement);
        deque.add("Orange");
        deque.add("Apple");
        deque.add("Banana");
        System.out.println(deque);
        List <String>li=new ArrayList<>(deque);
        Collections.sort(li);
        System.out.println(li);
        deque.pollLast();//Removes One element and retrive the list
        System.out.println(deque);

    }
}
