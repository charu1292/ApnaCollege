package org.example.Arrays;

public class BestTimeToSellBuyStocks {

    public static int buystocks(int[] prices){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++) {
            int sellingPrice=prices[i];
            if(buyprice<sellingPrice) {
                int profit = sellingPrice-buyprice; //todya's profit
                maxprofit=Math.max(profit,maxprofit);
            }
            else {
                buyprice=prices[i]; //if buy price greater than today's price then we update our buy price
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(buystocks(prices));
    }
}
