class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int c = 0;
        for(int i = 0; i < n - 1; i++) {
            int l = 0, r = 0;
            for(int j = 0; j <= i; j++){
                l += nums[j];
            }
            for(int k = i+1; k < n; k++){
                r += nums[k];
            }
            if((l - r) % 2 == 0) c++;
        }
        return c;
    }
}