package LeetCode;
import LeetCode.PublicListNode.ListNode;
public class MergeKLists {

    /**
     *
     * 已完成
     */


    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode listNode = new ListNode(0);
        if (lists.length == 0) {
            return listNode.next;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        for (int i = 0; i < lists.length; i++) {
            listNode.next = mergeTwoLists(lists[i], listNode.next);

        }
        return listNode.next;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        while (l2 != null || l1 != null) {
            if (l1 == null) {
                temp.next = l2;
                break;
            }
            if (l2 == null) {
                temp.next = l1;
                break;
            }
            if (l1.val >= l2.val) {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            } else {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
        }
        return listNode.next;
    }

    public static void main(String[] args) {

    }
}
