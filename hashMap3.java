import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Amit");
        hm.put(2,"Vijay");
        hm.put(3,"Rahul");
        System.out.println(hm);
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap <Integer,String>hm1=new HashMap<>();
        hm1.put(4,"Sayak");
        System.out.println(hm1);
        hm.putAll(hm1);
        //Traversing by Map.entry
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());

        }
        hm.remove(2);
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
    }
}
