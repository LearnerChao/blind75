package DynamicProgramming;

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(
            robHelper(nums, 0, nums.length - 2),
            robHelper(nums, 1, nums.length - 1)
        );
    }

    public int robHelper(int[] rob, int start, int end) {
        int curr = 0, prev = 0, prev2 = 0;
        for (int i = start; i <= end; i++) {
            curr = Math.max(prev, prev2 + rob[i]);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}