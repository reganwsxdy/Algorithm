/**
 * 判断链表是否存在环
 * 思路：设置两个跟踪节点，一个每次循环指向下一个节点，另一个指向下一个的下一个节点，
 * */

public class singly_linked_list {
    public boolean hasCycle(ListNode head){
        if (head == null){
             return false;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null){
            if (l1 == l2){
                return true;
            }
        }
        return false;
    }
}
