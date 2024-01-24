import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist1 {
    public static void main(String[] args) {
        // Doubly Linkedlist by default
        LinkedList<String> li = new LinkedList<String>();
        li.add("Subha");
        li.add("Ritwik");
        li.add("Ritwik");
        li.add("Sayan");
        li.add("Sayak");


        // Print initial elements using a loop
        for (String i : li) {
            System.out.println(i);
        }

        // Add elements to the first and last positions
        li.addFirst("Sanglap");
        System.out.println("After addFirst: " + li);

        li.addLast("Souchik");
        System.out.println("After addLast: " + li);

        // Use iterator to print in reverse order
        Iterator it = li.descendingIterator();
        while (it.hasNext()) {
            System.out.print("<-" + it.next() + "->");
        }

        // Remove element at index 1
        li.remove(1);
        System.out.println();
        System.out.println("After removing element at index 1: " + li);
        System.out.println("LastIndexOf="+li.lastIndexOf("Ritwik"));
        System.out.println("First Element="+li.getFirst());
        System.out.println("Last Element="+li.getLast());
        System.out.println("IndexOf="+li.indexOf("Ritwik"));//Returns the first index
        System.out.println(li);
    }
}
