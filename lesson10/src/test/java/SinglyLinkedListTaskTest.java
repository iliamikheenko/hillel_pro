package test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTaskTest {
    SinglyLinkedListTask listTask;
    @Before
    public void init(){
        listTask = new SinglyLinkedListTask();
    }
    @Test
    public void reverseList_WithEmptyList_Test() {
        ListNode head = null;
        ListNode expected = null;
        ListNode actual = listTask.reverseList(head);
        assertEquals(expected,actual);
    }
    @Test
    public void reverseList_WithTwoElements_Test() {
        ListNode head = new ListNode(1,new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));
        ListNode actual = listTask.reverseList(head);
        while (expected.next != null){
            assertEquals(expected.val,actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
    @Test
    public void reverseList_WithFiveElements_Test() {
        ListNode head = new ListNode(1,
                        new ListNode(2,
                        new ListNode(3,
                        new ListNode(4,
                        new ListNode(5)))));
        ListNode expected = new ListNode(5,
                            new ListNode(4,
                            new ListNode(3,
                            new ListNode(2,
                            new ListNode(1)))));
        ListNode actual = listTask.reverseList(head);
        while (expected.next != null){
            assertEquals(expected.val,actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

}