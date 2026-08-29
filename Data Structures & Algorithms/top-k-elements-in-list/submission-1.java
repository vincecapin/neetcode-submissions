class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> frequencyList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            frequencyList.add(new int[]{entry.getValue(), entry.getKey()});
        }

        frequencyList.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];

        for (int i = 0; i < k; i++){
            result[i] = frequencyList.get(i)[1];
        }

        return result;
    }
}
