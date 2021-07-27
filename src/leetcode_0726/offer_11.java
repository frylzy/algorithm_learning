package leetcode_0726;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class offer_11 {
    public int minArray(int[] numbers) {
        // 中间元素与右边元素比较
        int l = 0;
        int r = numbers.length - 1;
        int m;
        while(l < r) {
            m = l + (r - l) / 2;
            if(numbers[m] < numbers[r]) {
                r = m;
            } else if (numbers[m] == numbers[r]) {
                r--;
            } else {
                l = m + 1;
            }
        }
        return numbers[l];
    }
}
