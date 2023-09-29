package Java.Practice;

public class PattenPrinting {

    public static void main(String[] args) {



        Pattern1(5);
        Pattern2(5);
        Pattern3(5);
        Pattern4(5);
        Pattern5(5);
        Pattern6(5);
        Pattern7(6);
        Pattern8(5);
        Pattern9(5);
        Pattern10(5);
        Pattern11(5);
        Pattern12(5);
    }


    static void Pattern1( int n){

        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++ ){
                if(i==0||j>=n-1||j==0||i>=n-1){
                    System.out.print(" * ");
                }
                else
                  System.out.print("   ");
            }
            System.out.println();

        }

    }
    static void Pattern2(int n){
        int x=0;
        int m=n;
        for (int i = 0 ; i <n ; i++) {
            for(int j=0;j<x*2;j++){
                if (x<=5){
                    System.out.print(" ");
                }
                else
                    break;
            }
            for (int j = 1; j <=m; j++) {
                System.out.print("* ");
            }
            ++m;
            x++;
            System.out.println();
        }
    }
    static void Pattern3(int n){
        int x=0;
        int m=n;
        for (int i = 0 ; i <n ; i++) {
            for(int j=0;j<x*2;j++){
                if (x<=5){
                    System.out.print("  ");
                }
                else
                    break;
            }
            for (int j = 1; j <=m; j++) {
                System.out.print("* ");
            }
            --m;
            x++;
            System.out.println();
        }
    }
    static void Pattern4(int n){
        int m=n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <m ; j++) {
                System.out.print("* ");
            }
            m--;
            System.out.println();
        }
        System.out.println();
    }
    static void Pattern5(int n){
        int m=n;
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            m--;
            for (int j = 0; j <=i; j++) {
            System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    static void Pattern6(int n){
        int m=n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                if(j%2==0)
                    System.out.print("! ");
                else
                    System.out.print("* ");
            }
            for (int j = 0; j <= i; j++) {
                if(j%2==0)
                    System.out.print("! ");
                else
                    System.out.print("* ");
            }
//            for (int j = 0; j <=i ; j++) {
//                if(j%2==0)
//                System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
            m--;
            System.out.println( );
        }
    }
    static void Pattern7(int n){
    int m=n;
    int x=m;
        for(int i=0;i<=n;i++){
            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            m--;
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <x; j++) {
                System.out.print( "* ");
            }
            x--;
            System.out.println();
        }
    }
    static void Pattern8(int n){
        int m=n;
        int x=m;
        for(int i=0;i<=n;i++){
            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            m--;
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <x-1; j++) {
                System.out.print( "* ");
            }
            x--;
            System.out.println();
        }
    }
    static void Pattern9(int n){
        int x=0;
        int c=n-1;
        int m=n;
        for (int i = 0 ; i <n ; i++) {
            for(int j=0;j<x*2;j++){
                if (x<=5){
                    System.out.print("  ");
                }
                else
                    break;
            }
            for (int j = 1; j <=m; j++) {
                System.out.print("* ");
            }
            --m;
            x++;
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<c*2;j++){
                if (c>0){
                    System.out.print("  ");
                }
                else
                    break;
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            c--;
            System.out.println();

        }
    }
    static void Pattern10(int n){
        int m=n;
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            m--;
            for (int j = 0; j <=i; j++) {
                System.out.print("1 ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("1 ");
            }
            System.out.println( );
        }
    }
    static void Pattern11(int n){
        int m=n;
        for (int i = 1; i <=n ; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            m--;
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println( );
        }
    }
    static void Pattern12(int n){
        int m=n;
        int num=1;
        for (int i = 1; i <=n ; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print("  ");
            }
            m--;
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            for (int j = 1; j < i; j++) {
                System.out.print(num+"  ");
                num++;
            }
            System.out.println( );
        }
    }

}
