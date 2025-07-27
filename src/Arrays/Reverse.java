package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void reverse(int arr[], int start, int end ){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int n = arr.length;
        reverse(arr,0, n-1);
        System.out.println(Arrays.toString(arr));

    }
}
