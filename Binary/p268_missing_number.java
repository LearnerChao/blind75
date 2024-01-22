package Binary;

class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        return xor;
    }
}