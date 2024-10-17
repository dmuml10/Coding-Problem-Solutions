package leetcode.medium;

class GreatestCommonDivisorLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        var newL = head;
        while(head.next != null) {
            var a = head.val;
            var b = head.next;
            var gcd = gcd(a,b.val);
            var newNode = new ListNode(gcd);
            head.next = newNode;
            newNode.next = b;
            head = b;
        }
        return newL;
    }

    private int gcd(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1;
        for (int i=1; i<=min; i++) {
            if (a%i == 0 && b%i==0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
