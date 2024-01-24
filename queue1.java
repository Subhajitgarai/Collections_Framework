import java.util.Iterator;
import java.util.PriorityQueue;

public class queue1 {
    public static void main(String[] args) {
        PriorityQueue<String>queue=new PriorityQueue<>();
        //Queue is fromed according to priority alphabetically
        queue.add("Subha");
        queue.add("Sayan");
        queue.add("Ritwik");
        queue.add("zab");
        queue.add("Aab");
        System.out.println(queue);
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("Removed Elements="+queue.remove());
        System.out.println(queue);
        queue.poll();//Remove the first element and Retrive
        System.out.println(queue);
        System.out.println(queue);
        System.out.println(queue.getClass());
        Iterator i=queue.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+"->");
        }

    }
}
