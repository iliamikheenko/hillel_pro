package main.java;

public class SinglyLinkedListTask {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next;
        while (head != null){
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }
}

