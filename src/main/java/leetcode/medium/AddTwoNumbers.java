package leetcode.medium;

public class AddTwoNumbers {

    class Solution {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         * int val;
         * ListNode next;
         * ListNode() {}
         * ListNode(int val) { this.val = val; }
         * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum = l1.val + l2.val;
            boolean extraOne = false;
            if (l1.val + l2.val > 9) {
                extraOne = true;
                sum = sum - 10;
            }
            String result = sum + "";
            while (l1.next != null || l2.next != null) {
                int l1Val = 0;
                int l2Val = 0;
                if (l1.next != null) {
                    l1 = l1.next;
                    l1Val = l1.val;
                }
                if (l2.next != null) {
                    l2 = l2.next;
                    l2Val = l2.val;
                }

                sum = l1Val + l2Val;
                if (extraOne) {
                    sum += 1;
                }
                extraOne = false;
                if (sum > 9) {
                    extraOne = true;
                    sum = sum - 10;
                }

                result = result + sum;
            }
            if (extraOne) {
                result = result + "1";
            }

            ListNode ln = new ListNode();
            ListNode resultNode = ln;
            System.out.println(result);
            for (int i = 0; i < result.length(); i++) {
                ln.val = Character.getNumericValue(result.charAt(i));
                if (i != result.length() - 1) {
                    ln.next = new ListNode();
                }
                ln = ln.next;
            }
            return resultNode;
        }
    }
}