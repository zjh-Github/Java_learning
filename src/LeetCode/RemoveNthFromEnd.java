package LeetCode;

public class RemoveNthFromEnd {
    /**
     *
     * 已完成
     */
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
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = listNode;
        size -= n;
        while (size > 0) {
            size--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return listNode.next;
    }
}
