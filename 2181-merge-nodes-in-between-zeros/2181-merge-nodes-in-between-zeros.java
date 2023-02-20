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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode p1 = temp;
        ListNode p2 = head.next;
        int sum = 0;
        while(p2 != null){
            if(p2.val != 0){
                sum += p2.val;
            }else if(p2.val == 0){
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            // System.out.print(p2.val +" ");
            p2 = p2.next;
        }
        return p1.next;
    }
}