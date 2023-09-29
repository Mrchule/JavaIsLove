package Java.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteNnumber {
    public static void main(String[] args) {
        String str="39645";
        int x=str.length();
        int k=3;
    char[] arr=new char[x];
        for(int i=0; i<x;i++){
        arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }

}
