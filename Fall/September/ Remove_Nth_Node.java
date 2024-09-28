class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Calculate the total length of the linked list
        int total_length = 0;
        ListNode current = head;
        while (current != null) {
            total_length++;
            current = current.next;
        }

        // If we're removing the head (n is equal to total length)
        if (n == total_length) {
            return head.next; // Simply return the next node as the new head
        }

        // Find the node just before the one to delete
        int positionToReach = total_length - n;
        ListNode delete = head;
        for (int i = 1; i < positionToReach; i++) { // Go to the node before the target node
            delete = delete.next;
        }

        // Remove the nth node from the end
        delete.next = delete.next.next;

        return head;
    }
}
