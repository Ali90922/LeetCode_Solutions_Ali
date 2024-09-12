
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














// Two sum solution pyhton brute force : 


def two_sum_brute_force(nums, target):
    # Loop through each element in the list
    for i in range(len(nums)):
        # Check each subsequent element to find a pair that sums to the target
        for j in range(i + 1, len(nums)):
            # If a pair is found, return their indices
            if nums[i] + nums[j] == target:
                return [i, j]
    return None  # Return None if no pair found






// Now two sum solution in pyhton, with a Hashmap  Optimal solution : 
    def two_sum_hash_map(nums, target):
    # Create a dictionary to store the difference and corresponding index
    num_map = {}
    # Loop through each element in the list
    for i, num in enumerate(nums):
        # Calculate the complement that would sum with the current element to make the target
        complement = target - num
        # If the complement is already in the map, return the indices
        if complement in num_map:
            return [num_map[complement], i]
        # Otherwise, add the current element and its index to the map
        num_map[num] = i
    return None  # Return None if no pair found

