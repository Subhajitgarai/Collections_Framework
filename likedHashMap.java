import java.util.*;
public class likedHashMap {
    public static void main(String[] args) {
        //Linked HashMap Maintains the insertion order
        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(1,"Amit");
        lhm.put(2,"Sayan");
        lhm.put(3,"Sayak");
        lhm.put(4,"Ayan");
        for(Map.Entry m:lhm.entrySet()){

            System.out.println(m.getKey()+"  "+m.getValue());
        }
        lhm.remove(1);
        System.out.println(lhm);
        LinkedHashMap<Integer,String>lhm1=new LinkedHashMap<>();
        lhm1.put(7,"Shreya");
        lhm1.put(8,"Sangalap");
        lhm1.put(9,"Ritwik");
        lhm.putAll(lhm1);
        System.out.println(lhm);
        System.out.println(lhm.keySet());
        System.out.println(lhm.values());
        //TO COPY ONE LINKEDHASHSET TO OTHER LINKED HASHSET
        LinkedHashMap<Integer,String>lhm2=new LinkedHashMap<>(lhm);
        System.out.println(lhm2);

    }
}
