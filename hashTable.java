import java.util.Hashtable;
import java.util.Map;

public class hashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String>ht=new Hashtable<>();
        ht.put(1,"Subha");
        ht.put(2,"Aritra");
        ht.put(3,"Ritwik");
        ht.putIfAbsent(4,"Sayak");//will put the element if it is absent
//        System.out.println(ht);
        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
//        ht.remove(2);
//        System.out.println(ht);
//        /Here, we specify the if and else statement as arguments of the method
        System.out.println(ht.getOrDefault(10,"Not Found"));
        System.out.println(ht.getOrDefault(1,"Not Found"));//If the following key is present then return the value of the following key otherwise written message

    }
}
