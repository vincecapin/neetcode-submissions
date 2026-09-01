class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedStrs = new StringBuilder();

        for (String str : strs) {
            encodedStrs.append(str.length()).append('#').append(str);
        }

        return encodedStrs.toString();

    }

    public List<String> decode(String str) {
        // str = 4#This2#is7#

        // initial index
        // 4 parse as Int skip the #
        // Append sunstring for current to to length

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
