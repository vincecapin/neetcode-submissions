class Solution {
    public int longestConsecutive(int[] nums) {
        int numsLength = nums.length;

        if (numsLength == 0) return 0;

        int result = 0;
        int counter = 0; 
        int index = 0;

        Arrays.sort(nums);
        
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
