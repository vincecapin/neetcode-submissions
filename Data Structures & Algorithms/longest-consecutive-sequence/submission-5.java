class Solution {
    public int longestConsecutive(int[] nums) {
        // nums = [20, 10, 1, 6, 5 , 2, 3]
        int numsLength = nums.length;

        if (numsLength == 0) return 0;

        int result = 0;
        int counter = 0; 
        int index = 0;

        Arrays.sort(nums);
        // nums = [1,2,3,5,6,10,20]
        
        int currentNum = nums[0];

        while (index < numsLength) {

            if (nums[index] != currentNum) {
                counter = 0;
                currentNum = nums[index];
            }

            while (index < numsLength && nums[index] == currentNum) {
                index++;
            }

            currentNum++;
            counter++;

            result = Math.max(result, counter);
        }

        return result;
         
    }
}
