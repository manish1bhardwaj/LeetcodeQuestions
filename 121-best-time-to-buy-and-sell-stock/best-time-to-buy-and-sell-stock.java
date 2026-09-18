class Solution {
    public int maxProfit(int[] prices) {
        int mp  = 0;
        int minp = prices[0];

        for(int price : prices){
            minp = Math.min(minp,price);
            int pro = price - minp;
            mp = Math.max(mp,pro);
        }
        
        return mp;
    }
}