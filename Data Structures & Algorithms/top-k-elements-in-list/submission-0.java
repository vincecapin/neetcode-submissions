class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
      
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> freqList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()){
            freqList.add(new int[]{entry.getValue(), entry.getKey()});
        }

        freqList.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = freqList.get(i)[1];
        }
 
        return result;
    }
}
