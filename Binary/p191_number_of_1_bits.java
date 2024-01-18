package Binary;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0, mask = 1;
        int bits = 32;
        while(bits-- > 0) {
            count += (n & mask);
            n = n >> 1;
        }

        return count;
    }
}