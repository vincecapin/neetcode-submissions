class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    if (!seen.add(currentChar + "found row " + i) ||
                    !seen.add(currentChar + "found col" + j) ||
                    !seen.add(currentChar + "found 3x3" + i/3 + "-" + j/3)) {
                    return false;
                }
                }
            }
        }

        return true;
    }
}
