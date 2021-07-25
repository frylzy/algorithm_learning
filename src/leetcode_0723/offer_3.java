package leetcode_0723;

public class offer_3 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(i != nums[i] && nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            while(i != nums[i]) {
                int tmp = nums[i];
                int swap = nums[tmp];
                nums[tmp] = nums[i];
                nums[i] = swap;
            }
        }
        return -1;
    }
}
