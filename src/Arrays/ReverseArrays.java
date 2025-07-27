package Arrays;

public class ReverseArrays {

    // so basically swap the arrays

    static void reverseArrays(int arr[]){
      int start = 0;
      int end = arr.length-1;

      while(start<=end){
          int temp = arr[end];
           arr[end] = arr[start];
           arr[start] = temp;
           start++;
           end--;

      }


    }

    public static void main(String[] args) {
        int arr[] = {2,3,12,1,36,6};
        reverseArrays(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
