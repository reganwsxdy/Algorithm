/**
 * 两链表相加问题：通过java链表进行操作，其中head指向（代表）头节点或者首元节点，tail是尾节点，指向（代表）最后一个元素
 * 解题思路：初始化一个空链表作为接收结果的链表，其难点有两个，一个是两个相加的链表可能长度不同，另一个是相加的进位值要加到下一个节点中
 * 注意：在写while循环时（和for循环属于遍历，相对有所不同），要注意一般来说每一次循环过来会产生不同的情况（如果属于触发条件类型则改用switch非循环），
 * 因此要使用到多次if
 * l1 l2均为跟踪节点
 *
 * 代码在while中分为两个阶段，第一个阶段是l1l2还未遍历完时，第二个为两个链表都遍历完时
 *
 * */

public class test_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int plus = 0;
        while (l1!=null || l2!=null){
            int n1 = l1!=null?l1.val:0;
            int n2 = l2!=null?l2.val:0;
            int sums = n1 + n2 + plus;
            if (head == null){
                head = tail =new ListNode(sums%10);
            }else {
                tail.next = new ListNode(sums%10);
                tail = tail.next;
            }
            plus = sums/10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }

        }
        if (plus > 0){
            tail.next = new ListNode(plus);
        }
        return head;
    }
}
