class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, small = Integer.MAX_VALUE,profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if (prices[i] < small ){
                small = prices[i];
            }
            profit = prices[i] - small;
            if (max < profit) {
                max = profit;
            }

        }


        return max;

    }
}