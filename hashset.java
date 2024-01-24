import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        //In hash set duplicate values does not allowed
        HashSet <Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);
        //Hashset Doesnot maintain the insertion oreder
    }
}
