class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int repeatedno = 0;
            int checkable = nums[i];
            for (int z = 0; z < nums.length; z++) {
                if (nums[z] == checkable) {
                    repeatedno++;
                }
            }
            if (repeatedno > 1) {
                return true;
            }
        }
        return false;

    }
}

// Neetcode.io