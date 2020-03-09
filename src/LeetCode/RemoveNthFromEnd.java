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
        ListNode listNode = new ListNode(1);
        ListNode list = listNode.next;


        return list;
    }
}
