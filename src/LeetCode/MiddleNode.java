package LeetCode;

import LeetCode.PublicListNode.ListNode;

public class MiddleNode {

    /**
     * 已完成
     */
    public static ListNode middleNode(ListNode head) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        int size = 0;
        if (head == null) {
            return head;
        }
        while (head != null) {
            size++;
            head = head.next;
        }
        int middle = size / 2 + 1;
        while (middle > 0) {
            listNode = listNode.next;
            middle--;
        }
        return listNode.next;
    }

    public static void main(String[] args) {

    }
}
