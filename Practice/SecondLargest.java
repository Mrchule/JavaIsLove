package Java.Practice;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr={2,43,45,345,24,2134};
      int x= Largest(arr);
       System.out.println(x);

    }
    static int Largest(int[] arr) {

        for (int i = 0; i < 2; i++) {
         for(int j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }

         }
        }
        System.out.println(arr[arr.length-2]);
       return arr[arr.length-1];

    }
}
