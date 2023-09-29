package Java.Practice;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class CountEvenNum {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                count+=1;
            }
        }
        System.out.println("Numbers of even number in the array :"+count);



    }
}
