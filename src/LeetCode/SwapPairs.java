package LeetCode;

import LeetCode.PublicListNode.ListNode;

public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        ListNode res = new ListNode(0);
        if (head == null) {
            return listNode.next;
        }
        while (head != null) {
            if (head.next != null) {
                temp.next = head.next;
                temp = temp.next;
                res.next = head;
                res = res.next;
                System.out.println("temp:" + temp.val);
                System.out.println("res:" + res.val);
                System.out.println("head.next:" + head.next.val);
                System.out.println("head:" + head.val);
                if (head.next.next != null) {
                    head = head.next.next;
                } else {
                    head = head.next;
                }
            } else {
                head = head.next;
            }
        }
        return listNode.next;
    }

    public static void main(String[] args) {

    }
}
