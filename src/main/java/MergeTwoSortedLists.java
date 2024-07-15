public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode listNode = mergeTwoLists(list1.next, list2.next);
        if (listNode != null) {
            if (list1.val > listNode.val) {
                list1 = mergeTwoLists(list1, listNode);
            } else if (list2.val > listNode.val) {
                list2 = mergeTwoLists(list2, listNode);
            }
        }
        if (list1.val < list2.val) {
            list1.next = list2;
            list2.next = listNode;
            return list1;
        } else {
            list2.next = list1;
            list1.next = listNode;
            return list2;
        }
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
