package DynamicProgramming;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int longest = 0;
        if (nums == null || nums.length == 0) {
            return longest;
        }

        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            dp[i] = Math.max(dp[i], 1);
            longest = Math.max(dp[i], longest);
        }

        return longest;
    }
}
