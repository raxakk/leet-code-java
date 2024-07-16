import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        List<ListNode> listNodes = new ArrayList<>();
        forEach(list1, listNodes::add);
        forEach(list2, listNodes::add);
        listNodes.sort(Comparator.comparingInt(listNode -> listNode.val));
        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }
        return listNodes.getFirst();
    }

    static void forEach(ListNode listNode, Consumer<ListNode> consumer) {
        consumer.accept(listNode);
        if (listNode.next != null) {
            forEach(listNode.next, consumer);
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
