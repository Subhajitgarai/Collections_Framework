import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        System.out.println(al);
        al.set(0,"Orange");
        System.out.println(al);
        //Traversing by for each loop
        for(String i:al)
        {
            System.out.print(i+" ");
        }
    }
}
