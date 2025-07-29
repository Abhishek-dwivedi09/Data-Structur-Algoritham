package Arrays;

public class MaxProductOfSubArrays {

    static  int maxProduct(int nums[]){
        int n = nums.length;
        int res = Integer.MIN_VALUE;

        // brute force approach
//         for(int i =0; i<nums.length; i++){
//             int product= 1;
//             for(int j=i; j<nums.length; j++){
//                 product = nums[j]*product;
//                 res = Math.max(res,product);
//
//             }
//         }
//
//         return res;

        //  optimize approach
//        "Instead of checking all subarrays, I maintain two running products:
//        One from left to right (prefix product)
//        One from right to left (suffix product)
//        At every index i:
//        I multiply the current element with the running prefix and suffix.
//                If at any point the product becomes zero, I reset it to 1, since a zero breaks the continuity
//        take the max of the current prefix and suffix and update the global max product."**
//🔹 5. Mention Key Insight
//        "This works because negative numbers can flip the product — so the maximum product might" +
//                " be on the left, right, or across a zero. Scanning from both sides ensures we catch all those cases."

             int pref =1, suff=1;
             for(int i=0; i<n; i++){

                 if(pref==0) pref=1;
                 if(suff==0) suff =1;
                 pref*=nums[i];
                 suff*=nums[n-1-i];
                 res = Math.max(res,Math.max(pref,suff));
             }
             return res;
    }

    public static void main(String[] args) {
        int arr [] = {1,-2,3,4};
        System.out.println(maxProduct(arr));
    }
}
