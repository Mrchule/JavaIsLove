package Java.Practice;

import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        Factors(n);

    }
    public static void Factors(int n){

        for (int i = 2; i <= n/2 ; i++) {
            if(n%i==0){
                int rem=n/i;
                System.out.print(i+ " ");
            }
        }
    }
}
