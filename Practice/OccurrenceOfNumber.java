package Java.Practice;

import java.util.Scanner;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target;
        int[] arr=new int[n];
        System.out.println("enter target value");
        target=sc.nextInt();
        System.out.println("Enter array elements :");
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==target){
                count+=1;
            }
            else
                System.out.println("Element is not present");
        }
        System.out.println(target);

    }
}
