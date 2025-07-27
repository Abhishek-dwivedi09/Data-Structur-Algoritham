package Recursion;

public class ArrayRecursion {

    // print the element of the array

    static void printArray(int arr[], int idx){

        if(idx == arr.length)
            return;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }

    // find the maximum value in array using recurision

    static int maxValue(int arr[], int idx){

        // base case will be
        if(idx == arr.length-1)
            return arr[idx];

         int smallAns = maxValue(arr,idx+1);
         return  Math.max(smallAns, arr[idx]);
    }




    public static void main(String[] args) {
        int arr [] = {2,9,2,3,5,5};

        //printArray(arr,0);
        System.out.println(maxValue(arr,0));



    }
}
