package Java.Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println( Ispalindrome(x));


    }
    public static boolean Ispalindrome(int x){
        int temp=x;
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(temp==sum)
            return true;
        else
            return false;

    }
}
