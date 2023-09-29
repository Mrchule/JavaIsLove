package Java.Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> x=new ArrayList<Integer>();
        ArrayList<String> str=new  ArrayList<String>();
        x.add(2);
        x.add(9);
        System.out.println("Enter five elements ");
        for (int i = 0; i < 5; i++) {
            x.add(sc.nextInt());
        }
        
        System.out.println(x);

//        int a=x.size();
//        x.add(1,12);
//        x.add(1,13);
//        x.set(1,15);
//        x.remove(3);
//        str.add("hello");
//        str.add("world");
//        System.out.println(x);
//        str.remove("hello");
//        str.remove("world");
//        System.out.println(str);
//        System.out.println(a);
    }
}
