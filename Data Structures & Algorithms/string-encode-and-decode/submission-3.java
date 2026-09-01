class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            result.append(str.length()).append(',');
        }

        result.append('#');

        for (String str : strs) {
            result.append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int index = 0;
        while (str.charAt(index) != '#') {
            StringBuilder currentChar = new StringBuilder();
            while (str.charAt(index) != ',') {
                currentChar.append(str.charAt(index));
                index++;
            }
            sizes.add(Integer.parseInt(currentChar.toString()));
            index++;
        }

        index++;
        for (int size : sizes) {
            result.add(str.substring(index, index + size));
            index += size;
        }

        return result;

    }
}
