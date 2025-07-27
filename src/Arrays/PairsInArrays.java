package Arrays;

public class PairsInArrays {

    public static void pairs(int arr[]){
        int n = arr.length;
        int tp = 0;
        for(int i =0; i<n; i++){
               int pair = arr[i];
            for(int j = i+1; j<n; j++){
                System.out.print("(" + pair +" "+ arr[j]+ ")");
                tp++;
            }
            System.out.println();
        }

   System.out.println("total pairs is "+ tp);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        pairs(arr);
    }
}
