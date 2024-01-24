//Multi Threading by implementing Runnable Interface
class Demo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread="+i);
        }
    }
}class Demo1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1="+i);
        }
    }
}class Demo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread2="+i);
        }
    }
}
public class imprunthread {
    public static void main(String[] args) {
        Demo ob=new Demo();
        Thread t=new Thread(ob);
        t.start();
        Demo1 ob1=new Demo1();
        Thread t1=new Thread(ob1);
        t1.start();
        Demo2 ob2=new Demo2();
        Thread t2=new Thread(ob2);
        t2.start();
        for(int i=0;i<10;i++){
            System.out.println("Main="+i);
        }
    }
}

