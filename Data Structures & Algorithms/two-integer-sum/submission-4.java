class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap <Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
           
            if (numbersMap.containsKey(diff) && i != numbersMap.get(diff)){
                result[0] = numbersMap.get(diff);
                result[1] = i; 
            }
            
            numbersMap.put(nums[i], i);
        }
        return result;
    }
}


