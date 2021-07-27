package leetcode_0726;

public class offer_12 {
    public boolean exist(char[][] board, String word) {
        //找到第一个字符相等的，这时候传参index=0
        int m = board.length;
        if(m == 0) {
            return false;
        }
        int n = board[0].length;
        if(n == 0) {
            return false;
        }
        if(word.length() == 0) {
            return true;
        }
        boolean flag = false;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0)) {
                    flag = dfs(word, 0, board, i, j, visited);
                    if(flag == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(String word, int index, char[][] board, int row, int col, boolean[][] visited) {
        if(index == word.length()) {
            return true;
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        boolean hasPath = false;
        visited[row][col] = true;
        index++;
        hasPath =
                dfs(word, index, board, row + 1, col, visited) ||
                        dfs(word, index, board, row, col + 1, visited) ||
                        dfs(word, index, board, row - 1, col, visited) ||
                        dfs(word, index, board, row, col - 1, visited);
        if(hasPath == false) {
            visited[row][col] = false;
            index--;
        }
        return hasPath;
    }
}
