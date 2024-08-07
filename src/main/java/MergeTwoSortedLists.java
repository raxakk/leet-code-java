public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            return mergeTwoLists(list2, list1);
        }
        if (list1.next == null) {
            list1.next = list2;
            return list1;
        }
        if (list1.next.val <= list2.val) {
            if (list1.next.next != null) {
                list1.next.next = mergeTwoLists(list1.next.next, list2);
                return list1;
            }
            list1.next.next = list2;
            return list1;
        }
        ListNode buffer = list1.next;
        list1.next = list2;
        return mergeTwoLists(list1, buffer);

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
