package Java.Practice;

import com.sun.security.jgss.GSSUtil;

public class ReversString {
    public static void main(String[] args) {
        String str="madam";
        String str1="";
        String str2="madam";
        int n=str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            str1+=str.charAt(n);
            n--;
        }
//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println("str 2="+str1);
//        System.out.println(str1.length());
//        System.out.println(str.equals(str1));
//        System.out.println(str1);
//        System.out.println(str.equals(str1));
//        System.out.println(str.equals(str2));


        String s1 = "abc";
        String s2 = "abc";
//        System.out.println();
//        System.out.println(str==str1);
//         Note that this == compares whether
//         s1 and s2 refer to same object or not
        if (str==str1)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
