class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();

        for (int i : nums) {
            if (hashSet.contains(i)){
                return true;
            }
            hashSet.add(i);
        }

        return false;
    }
}