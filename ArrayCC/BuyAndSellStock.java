public class BuyAndSellStock {
    //Time Complexicity - O(n)
    public static int BuyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;  
        int maxProfit = 0;

        for ( int i = 0 ; i < prices.length ; i++ ){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit =  Math.max(maxProfit,profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit :" + BuyAndSellStock(prices));

    }
    
}


//We have considered it to be +infinite as for the first day there is nothing known as bp or sp so to set standard we intentionally wanted to run 2nd condition to see the start value