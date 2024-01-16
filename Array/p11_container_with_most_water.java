class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int max = 0;
        int left = 0, right = height.length - 1;
        while(left < right) {
            int sq = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(max, sq);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}