package Maps;
import java.util.*;

public class MostFrequentElements {
    public static void main(String[] args) {
        int arr [] = {1,2,1,2,1,1,3,3,3,3,4};
        // most frequest elements in array

        Map<Integer, Integer>hm = new HashMap<>();
        for(int ele: arr){
            if(hm.containsKey(ele)){
                hm.put(ele, hm.get(ele)+1);
            }
            else{
                hm.put(ele,1);
            }
        }
        int mostFrequentElement = -1;
        int maxFrequency = 0;
        for(int key : hm.keySet()){
            if(hm.get(key)>mostFrequentElement){
                maxFrequency = hm.get(key);
                mostFrequentElement = key;
            }
        }
        System.out.println("Most frequent element: " + mostFrequentElement);
        System.out.println("Most frequency  element: " + maxFrequency);
    }

}
