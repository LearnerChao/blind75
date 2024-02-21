package DynamicProgramming;

class Solution {
    public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] combinations = new int[target + 1];
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num > i) {
                    continue;
                } else if (num == i) {
                    combinations[i]++;
                } else {
                    combinations[i] += combinations[i - num];
                }
            }
        }

        return combinations[target];
    }
}