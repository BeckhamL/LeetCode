// Solution: keep track of the previous element, if the current > previous increment the counter
// Runtime: O(n)

class Solution {
    public int findLengthOfLCIS(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int prev = nums[0];
        int counter = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev) {
                counter++;
                prev = nums[i];
            }
            else {
                prev = nums[i];
                counter = 1;
            }

            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }
}
