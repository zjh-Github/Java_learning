package LeetCode;

import LeetCode.PublicListNode.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode res = listNode;
        if (head == null || head.next == null) {
            return head;
        }
        while (head != null && head.next != null) {
            ListNode l1 = head;
            listNode.next = head.next;
            res.next = l1;
            res = res.next;
            listNode = listNode.next;
            head = head.next.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {

    }
}
