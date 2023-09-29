package Java.Practice;

import java.util.Arrays;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,3,3,2,2,4,3,4,5,4};
         Arrays.sort(arr);
        System.out.println(Duplicate(arr));
    }
    static int Duplicate(int[] arr ){
        int c=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                c++;
            }

        }
        return c;
    }
}
