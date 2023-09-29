package Java.Practice;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter row and columns");
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
int[][] arr=new int[r][c];
        System.out.println("Enter arrays elements ");
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        show(arr , r, c);
    }
    static void show(int[][] arr, int r , int c){
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
