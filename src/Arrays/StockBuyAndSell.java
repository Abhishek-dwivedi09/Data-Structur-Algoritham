package Arrays;

public class StockBuyAndSell {
    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i= 0; i<prices.length; i++){
            if(prices[i]<min && i!=prices.length-1){
                min = prices[i];
                index = i;
            }
        }
        System.out.println("index value"+" "+index);

        for(int j= index; j<prices.length; j++){
            if(prices[j]>max)
                max = prices[j];
        }

        return max-min;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1};
        System.out.println(maxProfit(arr));

    }
}
