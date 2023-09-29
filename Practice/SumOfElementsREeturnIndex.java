package Java.Practice;

public class SumOfElementsREeturnIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=15;
        IndexReturn(arr,target);
    }
    public static void IndexReturn(int[] arr, int target){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                sum+=arr[j];
                if(sum==target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
            sum=0;
        }

    }
}
