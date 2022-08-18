public class _36_Valid_Sudoku {
    public static boolean check(char grid[][], int x, int y) {
        //row
        for (int i = 0; i < 9; i++) {
            if (i != y && grid[x][i] == grid[x][y] ) {
                return false;
            }
        }

        //column
        for (int i = 0; i < 9; i++) {
            if (i != x && grid[i][y] == grid[x][y]) {
                return false;
            }
        }

        //3x3
        int rs = x - x % 3;
        int cs = y - y % 3;
        for (int i = rs; i < rs + 3; i++) {
            for (int j = cs; j < cs + 3; j++) {
                if (i != x && j != y && grid[i][j] == grid[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !check(board,i,j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}} ;

        System.out.println(isValidSudoku(board));
    }
}
