package practise;

import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int temp [] = {1,2,3,4,5,6,7};
        int k =3;
        int n = temp.length;
        int arr[] = new int [n];
        int diff = n-k;
        int x = 0;
        for(int i = diff; i<n; i++){
            arr[x++] = temp[i];
        }
        for(int i = 0; i<diff; i++){
            arr[x++] = temp[i];
        }
        System.out.println("value of x"+ " " + x);
        System.out.println(Arrays.toString(arr));
    }
}
