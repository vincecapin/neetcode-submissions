class Solution {
    public int longestConsecutive(int[] nums) {
        int numsLength = nums.length;
        
        if (numsLength == 0) return 0;
        
        int result = 0;
        int currentNum = nums[0];
        int streakCount = 0;
        int index = 0;

        Arrays.sort(nums);

        while (index < numsLength) {
            if (currentNum != nums[index]) {
                currentNum = nums[index];
                streakCount = 0;
            }

            while (index < numsLength && currentNum == nums[index]) {
                index++;
            }

            streakCount++;
            currentNum++;

            result = Math.max(result, streakCount);
        }

        return result;
    }
}
