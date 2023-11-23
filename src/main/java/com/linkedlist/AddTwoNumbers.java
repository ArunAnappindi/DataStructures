package com.linkedlist;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


            ListNode head =  new ListNode();
            ListNode targetSum = head;
            int carryOver = 0;

            while (l1 != null || l2 != null) {
                int l1Val = 0;
                int l2Val = 0;
                if(l2 != null) {
                    l2Val = l2.val;
                }

                if(l1 != null) {
                    l1Val = l1.val;
                }
                int val =  (l1Val + l2Val + carryOver) >= 10 ?  ((l1Val + l2Val + carryOver) % 10) : (l1Val + l2Val + carryOver);

                double carryOverData = Math.floor((l1Val+l2Val+carryOver) / 10);
                Double doubleVal = new Double(carryOverData);

                carryOver = l1Val + l2Val + carryOver >= 10 ? doubleVal.intValue() : 0;
                //targetSum.val = val;
                targetSum.next = new ListNode(val);
                targetSum = targetSum.next;

                l1 = (l1 != null && l1.next != null) ? l1.next : null;
                l2 = (l2 != null && l2.next != null) ? l2.next: null;


            }

            if(carryOver > 0) {
                targetSum.next = new ListNode(carryOver);
            }


            return head.next;


        }


    public static void main(String[] args) {

        ListNode first = new ListNode();
        ListNode second = new ListNode();

        ListNode l1 = new ListNode();
        l1.val = 2;
        l1.next = new ListNode();
        first = l1;
        l1 = l1.next;
        l1.val = 4;
        l1.next = new ListNode();
        l1 = l1.next;
        l1.val = 3;

        ListNode l2 = new ListNode();
        l2.val = 5;
        l2.next = new ListNode();
        second = l2;
        l2 = l2.next;
        l2.val = 6;
        l2.next = new ListNode();
        l2 = l2.next;
        l2.val = 4;

        //addTwoNumbers(first, second);

        System.out.println(0%2);

    }
}
