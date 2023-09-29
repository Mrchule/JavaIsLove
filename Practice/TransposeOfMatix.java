package Java.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatix {
    public static void main(String[] args) {
        System.out.println("Enter  row then cols ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int[][] arr= new int[r][c];
        int[][] trans=new int[c][r];
        System.out.println("Enter elements of the matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
               trans[j][i]=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(trans));

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(trans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
