package Java.Practice;

import java.util.Arrays;

public class PeakElement {
    public static void main(String[] args) {
int[] arr={1,7,2,3,14,5};

int x=Index(arr);
        System.out.println(x);
    }

    static int Index(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
}
