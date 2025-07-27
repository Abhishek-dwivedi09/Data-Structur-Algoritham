package Arrays;
import java.util.*;

public class NexrPermutation {

    // what is next permutation
//    It means the way words are sorted in a dictionary.
//    For numbers:
//    123 < 132 < 213 < 231 < 312 < 321
//    So:
//    For input [1,2,3] → next permutation is [1,3,2]
//    For input [3,2,1] → next permutation is [1,2,3] (lowest order)

    // swap
    public static void swap(int[] nums, int i,int j){
        int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
    }

    // reverse
    public static void reverse(int []nums, int start, int end){
        while(start<end){
            swap(nums,start++, end--);
        }
    }
    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first index i where nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find j such that nums[j] > nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse everything after i
        reverse(nums, i + 1, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
     }
}
