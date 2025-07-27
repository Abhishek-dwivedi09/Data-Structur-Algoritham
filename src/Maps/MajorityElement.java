package Maps;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int majorityElement = 0;
        int n = nums.length;
        for(int ele: nums){
            if(hm.containsKey(ele)){
                hm.put(ele, hm.get(ele)+1);
            }
            else{
                hm.put(ele,1);
            }
        }
        // count frequency
        for(int ele: nums) {
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
        for(int key : hm.keySet()){
//            System.out.println("key"+" "+ key);
//            System.out.println("value" + " "+hm.get(key));
            if(hm.get(key)>n){
                majorityElement = key;
                System.out.println(key);
                // mostFrequentElement = key;
            }
        }

        return majorityElement;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
