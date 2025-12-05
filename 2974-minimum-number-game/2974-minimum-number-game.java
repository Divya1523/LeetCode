class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        Arrays.sort(nums);
        for(int i = 0; i < n; i += 2) {
            a[i+1] = nums[i];
            a[i] = nums[i + 1];
        }
        return a;
    }
}