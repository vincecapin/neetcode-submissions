class Solution {
    public int[] productExceptSelf(int[] nums) {
        // suf[i] = nums[i + 1] * suf[i + 1]
        // suf[3] = 1;
        // suf[2] = 4;
        // suf[1] = 12;
        // suf[0] = 24;

        // result = [24, 12, 8, 6]

        int numsLength = nums.length;
        int[] prefixProduct = new int[numsLength];
        int[] suffixProduct = new int[numsLength];
        int[] productOfArray = new int[numsLength];

        prefixProduct[0] = 1;

        for (int i = 1; i < numsLength; i++) {
            prefixProduct[i] = nums[i - 1] * prefixProduct[i - 1];
        }

        suffixProduct[numsLength - 1] = 1;

        for (int i = numsLength - 2; i >= 0; i--) {
            suffixProduct[i] = nums[i + 1] * suffixProduct[i + 1];
        }

        for (int i = 0; i < numsLength; i++) {
            productOfArray[i] = prefixProduct[i] * suffixProduct[i];
        }

        return productOfArray;
    }
}  
