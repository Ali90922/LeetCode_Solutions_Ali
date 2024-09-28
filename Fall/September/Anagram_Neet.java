class Solution {
    public boolean isAnagram(String s, String t) {

        // Important one, learn the Java sort and equals commands !
        // Split the two strings into an Array !
        boolean Returnable;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        if (ss.length != tt.length) {
            return false;
        }

        // Sort the character arrays
        Arrays.sort(ss);
        Arrays.sort(tt);

        // Compare the sorted arrays
        return Arrays.equals(ss, tt);

    }
}
