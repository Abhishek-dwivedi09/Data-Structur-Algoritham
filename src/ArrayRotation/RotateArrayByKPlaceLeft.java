package ArrayRotation;

public class RotateArrayByKPlaceLeft {

    public  static  void  leftRotationByKplace(int arr[], int k){
         // first reverse the k elements
        reverse(arr,0,k-1);

        // rever the n-k elements
        reverse(arr,k, arr.length-1);

        // then reverse the whole array
        reverse(arr,0, arr.length-1);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void reverse(int arr[], int left, int right){

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]  = temp;
            left++;
            right--;
        }
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};  // out - {4,5,6,7,1,2,3}
        int k=3;

        // right roataion is {5,6,7,1,2,3,4}

//        reverse(arr,0,arr.length-
//leftRotationByKplace(arr, k);
         System.out.println();

         // right rotation by k is
         int n = arr.length;

          leftRotationByKplace(arr,n-k);


    }

 }
