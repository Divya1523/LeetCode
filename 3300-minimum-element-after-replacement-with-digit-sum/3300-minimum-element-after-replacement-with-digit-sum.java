class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length;i++){
            nums[i] = digitsum(nums[i]);
        }
        int min = Arrays.stream(nums).min().getAsInt();
        return min;
    }
    private int digitsum(int n){
        int s = 0;
        while(n > 0){
            int t = n % 10;
            s += t;
            n /= 10;
        }
        return s;
    }
}