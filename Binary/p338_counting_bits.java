package Binary;

class Solution {
    public int[] countBits(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("invalid n");
        } else if (n == 0) {
            return new int[] {0};
        }

        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;

        for (int i = 2; i <= n; i++) {
            int powerOf2 = getPower(i);
            ans[i] = 1 + ans[i - (1 << powerOf2)];
        }

        return ans;
    }

    private int getPower(int num) {
        int i = 0;
        while (1 << i <= num) {
            i++;
        }

        return i-1;
    }
}