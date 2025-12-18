class Solution {
    public int[] arrayRankTransform(int[] arr) {
       
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            // Only assign rank if we haven't seen this number before
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        // 3. Transform the original array into their ranks
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}