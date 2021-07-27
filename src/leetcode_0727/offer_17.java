package leetcode_0727;

import java.util.ArrayList;
import java.util.List;

public class offer_17 {
    private char[] num;
    private char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    List<String> res = new ArrayList<>();
    public int[] printNumbers(int n) {
        num = new char[n];
        for(int i = 1; i <= n; i++) {
            dfs(0, i);
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            ans[i] = Integer.parseInt(res.get(i));
        }
        return ans;
    }
    private void dfs(int index, int len) {
        if(index == len) {
            res.add(new String(num).substring(0, len));
            return;
        }
        int start = 0;
        if(index == 0) {
            start++;
        }
        for(int i = start; i < chars.length; i++) {
            num[index] = chars[i];
            dfs(index + 1, len);
        }
    }
}
