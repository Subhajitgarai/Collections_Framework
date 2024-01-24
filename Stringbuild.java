public class Stringbuild {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb);
        sb.insert(1,"subha");//Insert elemnt Index wise
        System.out.println(sb);
        sb.replace(1,3,"Java");//Replaces
        System.out.println(sb);
        sb.delete(1,3);//Starting and ending index for deleting
        System.out.println(sb);
        System.out.println(sb.reverse());//For Reverse
        System.out.println(sb.capacity());//Capacity
    }
}
