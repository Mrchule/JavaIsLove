package Java.Practice;

public class SecondLargest2 {
    public static void main(String[] args) {
        int[] arr={1,243,2,43,20,1321};
        int max1;
        int max;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1]){
                max=arr[i];
                max1=arr[i+1];

            }
        }


    }
}
