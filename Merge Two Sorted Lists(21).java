class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode sol;
        if (list1.val <= list2.val) {
            sol = list1;
            sol.next = mergeTwoLists(list1.next, list2);
        } else {
            sol = list2;
            sol.next = mergeTwoLists(list1, list2.next);
        }
        return sol;
    }
}
