import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        var node3 = new MergeTwoSortedLists.ListNode(4, null);
        var node2 = new MergeTwoSortedLists.ListNode(2, node3);
        var node1 = new MergeTwoSortedLists.ListNode(1, node2);
//        var node6 = new MergeTwoSortedLists.ListNode(4, null);
        var node5 = new MergeTwoSortedLists.ListNode(5, null);
//        var node4 = new MergeTwoSortedLists.ListNode(1, node5);
        MergeTwoSortedLists.ListNode listNode = MergeTwoSortedLists.mergeTwoLists(node1, node5);

    }
}