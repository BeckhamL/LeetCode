class Solution {
    public int[] moveZeroes(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i == nums.length-1) {
                    return nums;
                }
                else {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            break;
                         }
                    }
                }
            }
        }
        return nums;
    }
}
