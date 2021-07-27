package leetcode_0726;

public class offer_13 {
    int ans = 0;
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        dfs(0, 0, m, n, k, visited);
        return ans;
    }
    private void dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if(i >= m || j >= n || getK(i) + getK(j) > k || visited[i][j]) {
            return;
        }
        ans++;
        visited[i][j] = true;
        dfs(i + 1, j, m, n, k, visited);
        dfs(i, j + 1, m, n, k, visited);
    }
    private int getK(int n) {
        int res = 0;
        while(n > 0) {
            res += n % 10;
            n = n / 10;
        }
        return res;
    }
}
