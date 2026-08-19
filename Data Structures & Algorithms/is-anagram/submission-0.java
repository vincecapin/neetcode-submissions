class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        String sorted_s = new String(sChars);
        String sorted_t = new String(tChars);

        if (sorted_s.equals(sorted_t)){
            return true;
        }
        return false;

    }
}
