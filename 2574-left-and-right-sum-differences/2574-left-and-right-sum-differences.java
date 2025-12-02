class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = 0;
        right[n-1] = 0;
        int k = 1, l = n - 2;
        int s = 0, t = 0;
        for(int i = 0; i < n - 1; i++) {
            s += nums[i];
            left[k] = s;
            k++;
        }
        for(int i = n - 1; i >= 1; i--) {
            t += nums[i];
            right[l] = t;
            l--;
        }
        for(int i = 0; i < n; i++){
            res[i] = Math.abs(left[i] - right[i]);
        }
        return res;
    }
}