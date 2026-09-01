class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedStrs = new StringBuilder();

        for (String str : strs) {
            encodedStrs.append(str.length()).append('#').append(str);
        }

        return encodedStrs.toString();

    }

    public List<String> decode(String str) {

        List<String> decodedStr = new ArrayList<>();
        int index = 0;

        while (index < str.length()) {
            int currentChar = index;

            while (str.charAt(currentChar) != '#') {
                currentChar++;
            }

            int strSize = Integer.parseInt(str.substring(index, currentChar));

            index = currentChar + 1;
            currentChar = strSize + index;

            decodedStr.add(str.substring(index, currentChar));

            index = currentChar;
        }

        return decodedStr;
    }
}
