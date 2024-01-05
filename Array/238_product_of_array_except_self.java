class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int len = nums.length;
        int[] results = new int[len];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            results[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (int i = len - 1; i >= 0; i--) {
            results[i] *= product;
            product *= nums[i];
        }

        return results;
    }
}