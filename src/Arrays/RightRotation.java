package Arrays;

import java.util.Arrays;

//public class ArrayRotation {
//
//    // Left rotation by k steps
//    public static void leftRotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n; // In case k > n
//
//        reverse(arr, 0, k - 1);        // Reverse first k elements
//        reverse(arr, k, n - 1);        // Reverse remaining elements
//        reverse(arr, 0, n - 1);        // Reverse whole array
//    }
//
//    // Right rotation by k steps
//    public static void rightRotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//
//        reverse(arr, 0, n - 1);        // Reverse whole array
//        reverse(arr, 0, k - 1);        // Reverse first k elements
//        reverse(arr, k, n - 1);        // Reverse remaining elements
//    }
//
//    // Helper method to reverse a subarray
//    private static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    // Driver code for testing
//    public static void main(String[] args) {
//        int[] original = {1, 2, 3, 4, 5};
//
//        int[] left = Arrays.copyOf(original, original.length);
//        leftRotate(left, 2);
//        System.out.println("Left rotated: " + Arrays.toString(left));
//
//        int[] right = Arrays.copyOf(original, original.length);
//        rightRotate(right, 2);
//        System.out.println("Right rotated: " + Arrays.toString(right));
//    }
//}


public class RightRotation {
    // right rotation by 1 place
    // 5,1,2,3,4

    public  static void rightRotate(int[] arr,int k){

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
    }
}