package Java.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("Enter  row then cols ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int[][] first= new int[r][c];
        int[][] second=new int[r][c];
        int[][] Final=new int[r][c];
        System.out.println("Enter elements of first matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                first[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second  matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                second[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
              Final[i][j]=first[i][j]+second[i][j];
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println(Arrays.toString(Final[i]));
        }
    }
}
