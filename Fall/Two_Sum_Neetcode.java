
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initializing a new Array
        int[] numbers = new int[2];

        // Brute force solution with a double for loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i != j) {
                        if (i > j) {
                            numbers[0] = j;
                            numbers[1] = i;
                        } else {
                            numbers[0] = i;
                            numbers[1] = j;
                        }

                    }
                }
            }
        }

        return numbers;

    }

    // Better solution with a Hashmap

    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store numbers and their corresponding indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array to find the two numbers that add up to the target
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that would sum with nums[i] to reach the target
            int complement = target - nums[i];

            // Check if the complement is already in the hash map
            if (map.containsKey(complement)) {
                // If found, return the indices of the current number and the complement
                return new int[] { map.get(complement), i };
            }

            // If not found, add the current number and its index to the hash map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (shouldn't happen per problem
        // constraints)
        return new int[0];
    }
}
