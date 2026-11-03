public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> yo = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            yo.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (yo.containsKey(diff) && yo.get(diff) != i) {
                return new int[]{i, yo.get(diff)};
            }
        }

        return new int[0];
    }
}
