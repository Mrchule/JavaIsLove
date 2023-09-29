package Java.Practice;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int[] arr ={1,45,2,523,423,342,34344};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        int l=arr.length;
//        System.out.println(arr.length);
        System.out.println(arr[arr.length-2]);
    }


}
