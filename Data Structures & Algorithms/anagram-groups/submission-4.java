class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs){
            int[] keyCounter = new int[26];
            for (int i = 0; i < str.length(); i++){
                keyCounter[str.charAt(i) - 'a']++;
            }

            String keyToString = Arrays.toString(keyCounter);
            result.putIfAbsent(keyToString, new ArrayList<>());
            result.get(keyToString).add(str);
        }
        
        return new ArrayList<>(result.values());
    }
}
