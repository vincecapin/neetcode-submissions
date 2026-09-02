class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int zeroCount = 0;
        int numsLength = nums.length;
        int[] productOfArray = new int[numsLength];

        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            }
            else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[numsLength];
        }

        for (int i = 0; i < numsLength; i++) {
            if (zeroCount > 0) {
                productOfArray[i] = (nums[i] == 0) ? totalProduct : 0;
            }
            else {
                productOfArray[i] = totalProduct / nums[i];
            }
        }

        return productOfArray;
    }
}  
