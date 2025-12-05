class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] a = new String[names.length];
        int k = 0;
        int n = heights.length;
        while(k < n){
            int max = Arrays.stream(heights).max().getAsInt();
            for(int i = 0; i < n; i++) {
                if(max == heights[i]) {
                    a[k] = names[i];
                    k++;
                    heights[i] = 0;
                }
            }
        }
        return a;
    }
}