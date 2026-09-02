class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int numsLenth = nums.length;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            }
            else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[numsLenth];
        }

        int[] result = new int[numsLenth];

        for (int i = 0; i < numsLenth; i++) {
            if (zeroCount > 0) {
                result[i] = (nums[i] == 0) ? product : 0;
            }
            else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}  
