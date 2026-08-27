class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> result = new HashMap<>();

        for (String str : strs){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String sortedStr = new String(strChar);
            result.putIfAbsent(sortedStr, new ArrayList<>());
            result.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(result.values());
    }
}
