import java.util.ArrayList;

public class arrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        ArrayList<Integer>al1=new ArrayList<>(al);
        System.out.println(al1);
    }
}
