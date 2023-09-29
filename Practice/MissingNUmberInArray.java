package Java.Practice;

public class MissingNUmberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,12};
int x=Missing(arr);
        System.out.println(x);
    }
    public static int Missing(int[] arr){
        int i=arr[0];
            for (int j = 0; j <arr.length-1 ; j++) {

                if(i!=arr[j]){
                    return i;
                }
                i++;
            }

return 0;
    }
}
