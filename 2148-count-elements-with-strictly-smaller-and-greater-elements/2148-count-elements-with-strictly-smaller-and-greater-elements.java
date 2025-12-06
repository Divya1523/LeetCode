class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int c =0;
        for(int i = 1; i < nums.length-1 ; i++) {
            if(nums[i] > min && nums[i] < max) c++;
        }
        return c;
    }
}