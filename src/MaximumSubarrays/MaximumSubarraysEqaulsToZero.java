package MaximumSubarrays;

//Given an array arr[] of size n, the task is to find the length of the longest subarray with sum equal to 0.
//
//Examples:
//
//Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
//Output: 5
//Explanation: The longest subarray with sum equals to 0 is {-2, 2, -8, 1, 7}
//
//
//Input: arr[] = {1, 2, 3}
//Output: 0
//Explanation: There is no subarray with 0 sum
//
//
//Input:  arr[] = {1, 0, 3}
//Output:  1
//Explanation: The longest sub-array with sum equal to 0 is {0}
//


import java.util.HashMap;

public class MaximumSubarraysEqaulsToZero{

    static int maximumSubarrays(int arr[]){
        //brute force apprpach
//    int maxlen  = 0;
//    for(int i=0; i<arr.length; i++){
//        int currSum = 0;
//        for (int j= i; j<arr.length; j++){
//            currSum+=arr[i];
//            if (currSum==0)
//                maxlen = Math.max(maxlen, j - i + 1);
//        }
//    }
//    return maxlen;

    // optimal solution
    // Map to store the previous sums
    HashMap<Integer, Integer> presum = new HashMap<>();

    int sum = 0;
    int max_len = 0;

    // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {

        // Add current element to sum
        sum += arr[i];

        // If the sum is 0, update max_len
        if (sum == 0) {
            max_len = i + 1;
        }

        // Check if this sum is seen before
        if (presum.containsKey(sum)) {

            // If this sum is seen before, update
            // max_len
            max_len = Math.max(max_len,
                    i - presum.get(sum));
        }
        else {

            // If this sum is not seen before, add it to
            // the map
            presum.put(sum, i);
        }
    }

        return max_len;
    }

    public static void main(String[] args) {
       int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
    }
}
