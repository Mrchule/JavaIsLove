package Java.Practice;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        System.out.println("Enter  row then cols ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int[][] arr= new int[r][c];
        System.out.println("Enter elements of the matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }

        }
        System.out.println("Sum of all entered number is ="+sum);

    }
}
