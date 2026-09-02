class Solution {
    public int[] productExceptSelf(int[] nums) {

        int numsLength = nums.length;
        int[] productOfArray = new int[numsLength];

        productOfArray[0] = 1;
        for (int i = 1; i < numsLength; i++) {
            productOfArray[i] = nums[i - 1] * productOfArray[i - 1];
        }

        int suffixProduct = 1;

        for (int i = numsLength - 1; i >= 0; i--) {
            productOfArray[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return productOfArray;
    }
}  
