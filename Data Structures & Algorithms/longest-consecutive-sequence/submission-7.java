class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums){
            numsSet.add(num);
        }

        int streak = 0;

        for (int numSet : numsSet) {
            if (!numsSet.contains(numSet - 1)) {
                int length = 1;

                while (numsSet.contains(numSet + length)) {
                    length++;
                }

                streak = Math.max(streak, length);
            }
        }

        return streak;
         
    }
}
