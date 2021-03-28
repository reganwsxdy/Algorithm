public class ListNodeSwapPairs {
    //递归法
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode sec = head.next;
        sec.next = swapPairs(sec.next);
        head.next = sec.next;
        sec.next = head;
        return sec;
    }
}
