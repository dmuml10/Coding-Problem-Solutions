package leetcode.medium;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
}
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode newNode = new ListNode();
        ListNode nHead = newNode;
        while(head.next != null) {
            sum += head.val;
            if (head.val == 0 && sum != 0) {
                newNode.val = sum;
                newNode.next = new ListNode();
                newNode = newNode.next;
                sum = 0;
            }
            head = head.next;
        }
        if (head.val == 0 && sum != 0) {
            newNode.val = sum;
        }
        return nHead;
    }
}