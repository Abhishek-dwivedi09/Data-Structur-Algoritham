package ArrayRotation;

public class LeftRotation {

    public  static  void rightRotationByOnePlace(int arr[]){

        int n = arr.length;

        int last = arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i+1] = arr[i];
        }

        arr[0] = last;

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static  void leftRotationByOnePlace(int arr[]){

        int first = arr[0];

        // shift all elements one place left
        int n = arr.length;

        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = first;

         for(int i=0; i<n; i++){
             System.out.print(arr[i]+" ");
         }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        // left rotation by one place output will be [2,3,4,5,1];
//         leftRotationByOnePlace(arr);


         // right rotation by one place output will be [5,1,2,3,4];
          rightRotationByOnePlace(arr);
    }
}
