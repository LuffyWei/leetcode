package com.leetcode.question;

public class T2 {

    public static void main(String[] args) {
        int[] a = {2,4,3};
        int[] b = {5,6,4};
        ListNode result = addTwoNumbers(init(a), init(b));
        while (result!= null) {
            System.out.print(result.val+",");
            result = result.next;
        }
    }

    public static ListNode init(int[] array) {
        ListNode listNode = new ListNode();
        ListNode p = listNode;
        for(int a : array) {
            listNode.val= a;
            ListNode next = new ListNode(0, null);
            listNode.next = next;
            listNode = next;
        }
        return p;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0, null);
        ListNode point = result;
        int hasOne = 0;
        while(l1.next != null && l2.next!=null) {
            result.val = (l1.val+l2.val+hasOne)%10;
            hasOne = (l1.val+l2.val+hasOne)/10;
            ListNode next = new ListNode(0, null);
            result.next = next;
            result = next;

            l1=l1.next;
            l2=l2.next;
        }
        while(l1.next != null && l2.next==null) {
            result.val = (l1.val+hasOne)%10;
            hasOne = (l1.val+hasOne)/10;
            ListNode next = new ListNode(0, null);
            result.next = next;
            result = next;

            l1=l1.next;
        }
        while(l1.next == null && l2.next!=null) {
            result.val = (l2.val+hasOne)%10;
            hasOne = (l2.val+hasOne)/10;
            ListNode next = new ListNode(0, null);
            result.next = next;
            result = next;

            l2=l2.next;
        }
        if(hasOne!=0) {
            ListNode next = new ListNode(hasOne, null);
            result.next = next;
            result = next;
        }
        return point;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
