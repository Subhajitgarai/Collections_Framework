import java.util.Map;
import java.util.TreeMap;

public class treeMap1 {
    public static void main(String[] args) {
        //TreeMap maintains ascending Order Key wise
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(1,"Sayak");
        tm.put(3,"Ritwik");
        tm.put(2,"Amit");

        System.out.println(tm);
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
        //To Print map in descending order
        System.out.println(tm.descendingMap());
        //headMap
        System.out.println("HeadMap="+tm.headMap(2,true));
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        //tailMap
        System.out.println("TailMap"+tm.tailMap(2,true));
        //Returns key-value pairs exists in between the specified key.
        //subMap
        System.out.println("SubMap="+tm.subMap(1,false,2,true));

    }
}
