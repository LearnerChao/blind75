import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> unique = new HashSet();
        for (int num : nums) {
            if (!unique.add(num)) {
                return true;
            }
        }

        return false;
    }
}