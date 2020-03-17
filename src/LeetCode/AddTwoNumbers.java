package LeetCode;

import LeetCode.PublicListNode.ListNode;
public class AddTwoNumbers {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {

    }

    /*
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(1);
        ListNode list = listNode;
        int count = 0;
        while (l1 != null || l2 != null) {
            int l1_num = (l1 != null ? l1.val : 0);
            int l2_num = (l2 != null ? l2.val : 0);
            int sum = (count > 0 ? (l1_num + l2_num + count) % 10 : l1_num + l2_num + count);
            count = (l1_num + l2_num + count >= 10 ? 1 : 0);

            list.next = new ListNode(sum % 10);
            list = list.next;

            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
            if (count > 0) {
                list.next = new ListNode(count);
            }

        }
        return listNode.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
