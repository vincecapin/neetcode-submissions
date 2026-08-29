class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> freqQueue = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            freqQueue.offer(new int[]{entry.getValue(), entry.getKey()});
            if (freqQueue.size() > k){
                freqQueue.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = freqQueue.poll()[1];
        }
        return result;
    }
}
