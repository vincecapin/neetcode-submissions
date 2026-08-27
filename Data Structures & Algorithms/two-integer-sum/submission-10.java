class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] numsCopy = new int[nums.length][2];

        for (int index = 0; index < nums.length; index++){
            numsCopy[index][0] = nums[index];
            numsCopy[index][1] = index;
        }

        Arrays.sort(numsCopy, Comparator.comparingInt(a -> a[0]));

        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            int sum = numsCopy[i][0] + numsCopy[j][0];

            if (sum == target){
                return new int[] {Math.min(numsCopy[i][1], numsCopy[j][1]),
                Math.max(numsCopy[i][1], numsCopy[j][1])};
            }
            if (sum < target){
                i++;
            }
            else {
                j--;
            }
        }

        return new int[0];
    }
}


