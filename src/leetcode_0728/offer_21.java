package leetcode_0728;

public class offer_21 {
    public int[] exchange(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            if((nums[start] & 1) == 0) {
                while(start < end && (nums[end] & 1) == 0) {
                    end--;
                }
                if(start < end && (nums[end] & 1) == 1) {
                    int tmp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = tmp;
                }
            }
            start++;
        }
        return nums;
    }
}
