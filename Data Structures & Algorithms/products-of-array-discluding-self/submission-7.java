class Solution {
    public int[] productExceptSelf(int[] nums) {

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
