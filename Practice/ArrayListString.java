package Java.Practice;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        System.out.println(str);
        str.add("Hello world");
        str.add("world");
        str.add(1,"hero");
        System.out.println();
        Vector<Integer> vec=new Vector<>();
       int c= vec.capacity();
        System.out.println(vec);
        System.out.println(c);
//        System.out.println(str);
    }
}
