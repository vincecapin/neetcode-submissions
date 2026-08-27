class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if (numsMap.containsKey(diff) && i != numsMap.get(diff)){
                return new int[] {numsMap.get(diff), i};
            }
            
            numsMap.put(nums[i], i);
        }

        return new int[0];
    }
}


