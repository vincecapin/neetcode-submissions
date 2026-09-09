class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];

            if (numbersMap.containsKey(diff)) {
                return new int[] {numbersMap.get(diff), i + 1};
            }

            numbersMap.put(numbers[i], i + 1);
        }

        return new int[0];
    }

}

