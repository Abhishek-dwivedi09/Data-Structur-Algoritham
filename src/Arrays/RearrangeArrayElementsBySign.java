package Arrays;
import java.util.*;
public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {

        // this code using extra space
//        List<Integer>positive = new ArrayList<>();
//        List<Integer>negative = new ArrayList<>();
//
//        // firstly add postive numbers and then add negative numbers
//        for(int val:nums){
//            if(val>0)
//                positive.add(val);
//            else
//                negative.add(val);
//        }
//
//        int ans[]= new int[nums.length];
//        int index=0,i=0,j=0;
//
//        for(index=0; index<nums.length; index++){
//            if(index%2==0)
//                ans[index]= positive.get(i++);
//            else
//                ans[index] = negative.get(j++);
//        }
//
//        return ans;

        // code without using extra  space here spcae complexity is 0(n) and auxilary space is 0(1)

        int res[] = new int[nums.length];
        int posIndex =0;
        int negIndex =1;
        for(int val:nums){
            if(val>0){
                res[posIndex] = val;
                  posIndex+=2;
            }
            else{
                res[negIndex] = val;
                 negIndex+=2;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));

    }
}
