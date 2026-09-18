class Solution {
    public int maxProfit(int[] prices) {
        int mp  = 0;
        int Bb = prices[0];

        for(int i = 1;i<prices.length;i++){
            if(prices[i]>Bb){
                mp = Math.max(mp,prices[i]-Bb);
            }
            Bb = Math.min(Bb,prices[i]);
        }
        return mp;
    }
}