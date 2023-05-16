package leetcode.easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode head = null;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val > list2.val) {
            result = list2;
            head = result;
            list2 = list2.next;
        }else {
            result = list1;
            head = result;
            list1 = list1.next;
        }

        while(true) {
            if (list1 == null) {
                result.next = list2;
                break;
            } else if(list2 == null) {
                result.next = list1;
                break;
            }

            if (list1.val > list2.val) {
                result.next = list2;
                list2 = list2.next;
            } else {
                result.next = list1;
                list1 = list1.next;
            }

            result = result.next;
        }
        return head;
    }

}

 class ListNode {
     int val;
    ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}