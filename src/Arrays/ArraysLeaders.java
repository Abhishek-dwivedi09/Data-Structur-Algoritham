package Arrays;

import java.util.*;

public class ArraysLeaders {

    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();

        int n = arr.length;
        int maxRight = arr[n-1];
        list.add(maxRight);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=maxRight){
                list.add(arr[i]);
                maxRight =  arr[i];
            }
        }
        Collections.reverse(list);


        return list;

    }

    public static void main(String[] args) {
        int arr[] = {20,21,2,3,7};
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);


    }
}
