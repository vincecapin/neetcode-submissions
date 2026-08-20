class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (hashMap.containsKey(diff) && hashMap.get(diff) != i){
                result[0] = hashMap.get(diff);
                result[1] = i;
            }

            hashMap.put(nums[i], i);
        }

        return result;
        

    }
}
