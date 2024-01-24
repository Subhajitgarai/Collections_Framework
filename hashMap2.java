//Twosum by hashMap
import java.util.*;
public class hashMap2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the number of elements:");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i:a){
            System.out.println(i);

        }
        System.out.println("Enter the sum:");
        sum=sc.nextInt();
        int f=0,l=0;
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int compliment=sum-a[i];
            if(hm.containsKey(compliment)){
                System.out.println("First="+i);
                System.out.println(hm.get(compliment));
                break;

            }
            else {
                hm.put(a[i],i);
            }
        }
        System.out.println(hm);

    }
}