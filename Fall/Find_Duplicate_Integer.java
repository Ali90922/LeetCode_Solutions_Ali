
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

    // Better solution -- improvement on the time complexity
    // This solution uses a Hashmap :
    import java.util.HashSet;
    import java.util.Set;

    public boolean hasDuplicate22(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false; // No duplicates
}
