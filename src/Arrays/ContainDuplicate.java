package Arrays;

public class ContainDuplicate {
    static boolean containDuplikate(int nums[], int k){
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j=1; j<n; j++){
                if(nums[i] == nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(containDuplikate(arr,k));


    }
}
