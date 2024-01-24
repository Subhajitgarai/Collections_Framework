import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //Stack Follows Lifo concepts
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Iterator it=st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Peek="+st.peek());
        System.out.println("Pop="+st.pop());//Element will be popped frm the last
        System.out.println(st);
        System.out.println();
    }
}
