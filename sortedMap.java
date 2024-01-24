import java.util.*;
public class sortedMap {
    public static void main(String[] args) {
        //Sorted Map NAd treeMap works same
        SortedMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println(map);
    }
}
