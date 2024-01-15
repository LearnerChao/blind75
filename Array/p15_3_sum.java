class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    results.add(Arrays.stream(
                        new int[] {nums[i], nums[j], nums[k]})
                        .boxed().collect(Collectors.toList()));
                } 
                
                if (sum >= 0) {
                    while(j < k && nums[--k] == nums[k+1]) continue;
                } 
                
                if (sum <= 0) {
                    while (j < k && nums[++j] == nums[j-1]) continue;
                }
            }
        }

        return results;
    }
}