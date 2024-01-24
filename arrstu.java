import java.util.ArrayList;
//Class as a structure for ArrayList
class student{
    int roll;
    String name;
    int age;
    student(int roll,String name,int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }
}
public class arrstu {
    public static void main(String[] args) {
        student ob=new student(1,"Subhajit",22);
        student ob1=new student(2,"Sayan",23);
        student ob2=new student(3,"Sayak",24);
        ArrayList<student> al=new ArrayList<>();
        al.add(ob);
        al.add(ob1);
        al.add(ob2);
        for(student i:al){
            System.out.println(i.roll+" "+i.name+" "+i.age);
        }
        System.out.println(al.isEmpty());
    }
}


