package SlidingWindow;

public class MaximumSum {
    //Given an array of integers and a number k, find the maximum sum of any contiguous subarray of length k.

//    static int maxSumSubarray(int[] nums, int k){
//        int windowSum = 0;
//        // firstly calculate the windows sum
//        for(int i=0; i<k; i++){
//            windowSum+=nums[i];
//        }
//        int maxSum = windowSum;
//        for(int i = k; i<nums.length; i++){
//           windowSum+=nums[i] - nums[i-k];
//           maxSum = Math.max(maxSum,windowSum);
//        }
//        return maxSum;
//    }

    // window maximum sum of k size window is equal to k

     static int maxSumSubarray(int[] arr,int k){

         int windowSum=0,maxSum=0,index=0, n=arr.length;

         for(int i=0; i<n; i++){
             while(index<n-k+i){
                 windowSum+=arr[i];
                 maxSum=Math.max(windowSum,maxSum);
                 index++;
             }
         }
         return maxSum;

     }
    public static void main(String[] args) {

        int[] nums = {1, 2,3,4,5};
        int k = 4;
        System.out.println(maxSumSubarray(nums,k));
    }
}
