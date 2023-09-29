package Java.Practice;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6};
        int[] arr2= {3 ,5 ,7 , 7 ,56,};
        System.out.println(Arrays.toString(Merge(arr1,arr2)));

    }
    public static int[] Merge(int[] arr1 , int[] arr2){
    int[] hello=new int[arr1.length+ arr2.length];
   int len=0;
        for (int i = 0; i < arr1.length; i++) {
            hello[len]=arr1[i];
            len++;
        }
        for (int i = 0; i < arr2.length; i++) {
            hello[len]=arr2[i];
            len++;

        }
        Arrays.sort(hello);
    return hello;
    }
}
