package leetcode_0726;

public class offer_4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;
        if (col == 0) {
            return false;
        }
        int m = row - 1;
        int n = 0;
        while(m < row && m >= 0 && n < col && n >= 0) {
            if(matrix[m][n] == target) {
                return true;
            } else if (matrix[m][n] < target) {
                n++;
            } else {
                m--;
            }
        }
        return false;
    }
}
