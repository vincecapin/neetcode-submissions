class Solution {
    public int[] productExceptSelf(int[] nums) {
        // nums = [1, 2, 3, 4]
        // totalproduct = 24
        // totalproduct / 2
        // result[0] = 24
        // reuslt[2] = 12

        // count numbers of zero
        // if zeroCount is greater than 1 return [length of num 0]
        // zeroCout is greater than 0; assign result[i] = 0;

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
