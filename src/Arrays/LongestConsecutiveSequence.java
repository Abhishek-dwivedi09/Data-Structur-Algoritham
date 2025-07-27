package Arrays;
import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer>hm = new HashSet<>();
        for (int val:nums){
            hm.add(val);
        }
        int maxLen =0;
        for(int num:hm){
//            We're checking only the start of sequences.
//            If num - 1 does not exist, that means num could be the start of a new consecutive sequence
            if(!hm.contains(num-1)){
                int currentNum = num;
                int currentSteak = 1;
                while(hm.contains(currentNum+1)){
                    currentNum+=1;
                    currentSteak+=1;

                }
                maxLen = Math.max(maxLen,currentSteak);

            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int arr [] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }
}
