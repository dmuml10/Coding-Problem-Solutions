package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        List<ListNode> list = new ArrayList<>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }

        for (int i=list.size()-1; i>0; i--) {
            list.get(i).next = list.get(i-1);
        }
        list.get(0).next = null;
        return list.get(list.size()-1);
    }

}
