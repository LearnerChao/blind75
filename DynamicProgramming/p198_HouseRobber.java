package DynamicProgramming;

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        int[] max = new int[len + 1];
        max[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            max[i] = Math.max(max[i-1], max[i-2] + nums[i-1]);
        }

        return max[len];
    }
}