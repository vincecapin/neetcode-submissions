class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        List<Integer> strSizes = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            strSizes.add(str.length());
        }
        
        for (int size : strSizes) {
            result.append(size).append(',');
        }

        result.append('#');

        for (String str : strs) {
            result.append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();

        int i = 0;
        List<Integer> sizes = new ArrayList<>();
        List<String> result = new ArrayList<>();
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }

        i++;
        
        for (int size : sizes) {
            result.add(str.substring(i, i + size));
            i += size;
        }
        return result;

    }
}
