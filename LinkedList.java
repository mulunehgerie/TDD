public class LinkedList {
    ListNode head;
    int size;
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++; // Increment size when adding a new element
    }
    public void remove(int val) {
        if (head == null) {
            return;
        }

        if (head.val == val) {
            head = head.next;
            size--; // Decrement size when removing an element
            return;
        }

        ListNode prev = head;
        ListNode current = head.next;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
                size--; // Decrement size when removing an element
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    
}
