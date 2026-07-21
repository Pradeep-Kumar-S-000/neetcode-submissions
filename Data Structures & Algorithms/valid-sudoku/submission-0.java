class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if(ch == '.') continue;

                int num = ch - '1'; // 0 to 8
                int box = (r/3)*3 + (c/3);

                if(rows[r][num] || columns[c][num] || boxes[box][num])
                    return false;

                rows[r][num] = true;
                columns[c][num] = true;
                boxes[box][num] = true;
            }
        }
        return true;
    }
}
