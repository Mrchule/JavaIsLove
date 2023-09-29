package Java.Practice;
import java.util.Scanner;
import java.util.Arrays;
public class ThirdLargestnumber {
    public static void main(String[] args) {
        System.out.println("Enter the  size of the array : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The 3rd largest no is ="+arr[n-3]);
    }
}
