/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 38.4 MB, less than 96.42% of Java online submissions for Search Insert Position.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (target <= nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target - nums[i] == 0 || target - nums[i] == -1) {
                return i;
            } else if (target - nums[i] == 1) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
