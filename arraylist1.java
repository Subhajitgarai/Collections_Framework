
import java.sql.SQLOutput;
import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
     ArrayList<Integer>al=new ArrayList<Integer>();
     ArrayList<Integer>al1=new ArrayList<>();

      Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements of array list");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
        al1.add(6);
        al1.add(7);
        al1.add(8);
        System.out.println(al1);
        al.addAll(al1);
//        Addall
        System.out.println(al);
        ArrayList<String>al2=new ArrayList<>();
        al2.add("Subha");
        System.out.println(al2);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Length of the arraylist="+al.toArray().length);


    }
}
