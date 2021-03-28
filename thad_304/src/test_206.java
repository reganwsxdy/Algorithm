/**
 * 反转链表
 * 新建的链表头结点为空节点
 * */

public class test_206 {
    public ListNode reverseList_iteration(ListNode head) {
        ListNode newHead = new ListNode(-1);
        while (head != null){//每次只插一个，但由于会断链，因此用next接收一下
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }

    public ListNode reverseList_recursion(ListNode head) {
        //递归尾插
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList_recursion(head.next);
        head.next.next =head;
        head.next = null;
        return newHead;
    }
}
