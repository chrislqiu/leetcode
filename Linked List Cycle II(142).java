public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> map = new HashMap<>();
        if (head == null) {
            return null;
        }
        while (head.next != null) {
            if (map.containsKey(head.next)) {
                return head.next;
            }
            map.put(head, head.next);
            head = head.next;
        }
        return null;
    }
}
