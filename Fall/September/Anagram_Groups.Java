
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group anagrams: sorted string as the key and list of original strings as the value
        Map<String, List<String>> map = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strs) {
            // Convert the string to a char array and sort it
            char[] ss = str.toCharArray();
            Arrays.sort(ss);
            // Convert sorted char array back to a string to use as a key
            String sorted = new String(ss);

            // If the sorted string is not in the map, add it with an empty list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // Add the original string to the corresponding list in the map
            map.get(sorted).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
