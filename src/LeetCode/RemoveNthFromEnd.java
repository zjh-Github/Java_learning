package LeetCode;

public class RemoveNthFromEnd {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(new ListNode(1), 3));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode list = listNode;
        for (int i = 0; i < n; i++) {
            list = list.next;
        }
        while (listNode.next != null) {
            if (listNode.next.val != n) {
                listNode.next = head.next;
            } else {
                listNode.next = head.next.next;
            }
        }
        return listNode;
    }
}
