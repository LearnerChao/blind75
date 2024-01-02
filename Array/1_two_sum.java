class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        Map<Integer, Integer> num2Index = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (num2Index.containsKey(nums[i])) {
                return new int[] {
                    num2Index.get(nums[i]),
                    i
                };
            } else {
                num2Index.put(target - nums[i], i);
            }
        }

        return null;
    }
}