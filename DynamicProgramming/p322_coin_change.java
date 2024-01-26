package DynamicProgramming;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }

        int[] fewest = new int[amount + 1];
        Arrays.fill(fewest, Integer.MAX_VALUE);
        fewest[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                int prev = i - coin;
                if (prev >= 0 && fewest[prev] != Integer.MAX_VALUE) {
                    fewest[i] = Math.min(fewest[i], fewest[prev] + 1);
                }
            }
        }

        return fewest[amount] == Integer.MAX_VALUE ? -1 : fewest[amount];
    }
}