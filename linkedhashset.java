import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        //Linked Hashset maintains the order of insertion
        LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        for(int i:lhs){
            System.out.print(i+"  ");
        }
        //Normal hashset does not maintains the order
        HashSet<Integer>hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println();
        for(int i:hs){
            System.out.print(i+"  ");
        }

    }
}
