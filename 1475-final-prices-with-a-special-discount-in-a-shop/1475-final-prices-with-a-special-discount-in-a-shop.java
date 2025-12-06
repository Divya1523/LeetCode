class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        int n = prices.length;
        for(int i =0 ;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(prices[j]<=prices[i]){
                res[i] = prices[i] - prices[j];
                break;
            }
            else {
                res[i] = prices[i];
            }
            }
        }
        res[n-1] = prices[n-1]; 
        return res;

    }
}