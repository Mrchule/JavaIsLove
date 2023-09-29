package Java.Practice;

public class FindNumberInARange {
    public static void main(String[] args) {

        int n=45;
        int x=n;
        int temp=n;
        int num=3;
    int c=0;
        for (int i = 0; i <= x; i++) {

            while(n!=0){
                int rem=n%10;

                if(rem==num){
                    c=c+1;
                    break;
                }
                n/=10;
            }
            temp--;
            n=temp;


        }
        System.out.println(x-c);
        System.out.println(c);

    }
//    static void Find(int x , int b){
//        int c=0;
//        while(x!=0){
//           int rem= x%10;
//           if (rem!=b){
//               x/=10;
//               c++;
//           }
//           else
//               c++;
//        }
//        System.out.println(c);
//    }
}
