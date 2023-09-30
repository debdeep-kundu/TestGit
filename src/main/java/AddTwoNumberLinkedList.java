
public class AddTwoNumberLinkedList {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l3 = addTwoNumbers(l1, l2);
        System.out.println(l3.val);
        while (l3.next != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Value = (l1 != null) ? l1.val : 0;
            int l2Value = (l2 != null) ? l2.val : 0;

            int sum = l1Value + l2Value + carry;

            carry = sum / 10;

            l3.next = new ListNode(sum % 10);
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        if(carry > 0){
            l3.next = new ListNode(carry);
            l3 = l3.next;
        }
        return dummy.next;
    }
}

