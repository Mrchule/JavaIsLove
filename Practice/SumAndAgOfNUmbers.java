package Java.Practice;
import java.util.Arrays;
import java.util.Scanner;
public class SumAndAgOfNUmbers {
    public static void main(String[] args) {

        System.out.println("Enter the size or range :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Array elements are "+ Arrays.toString(arr));
        System.out.println("sum="+sum+ "Average =" +(sum/n));

    }
}
