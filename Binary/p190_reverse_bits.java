package Binary;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0, mask = 1, bits = 32;
        while (bits-- > 0) {
            ans = ans << 1;
            ans = (ans | (mask & n));

            n = n >> 1;
        }

        return ans;
    }
}