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
    public ListNode swapPairs(ListNode head) {
    
//     // 1. Recursive solution. 

//         ListNode dummy = new ListNode();
//         dummy.next = head;
//         swap(dummy);
//         return dummy.next;
//     }
//     void swap(ListNode node){
//         if(node == null){
//             return;
//         }
        
//         ListNode first = node.next;
//         ListNode second = null;
//         if(first != null){
//             second = first.next;
//         }
//         if(second != null){
//             ListNode third = second.next;
//             second.next = first;
//             node.next = second;
//             first.next = third;
//             swap(first);
//         }
        
        // 2. Iteratice solution
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode node = dummy;
        while(node != null){
                  
            ListNode first = node.next;
            ListNode second = null;
            if(first != null){
                second = first.next;
            }
            if(second != null){
                ListNode third = second.next;
                second.next = first;
                node.next = second;
                first.next = third;
                node = first;
            }else{
                break;
            }
        }
        return dummy.next;
    }
}