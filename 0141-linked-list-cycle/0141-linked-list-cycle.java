/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        if(head == null){
            return false;
        }
        while(temp.next != null){
            if(set.contains(temp)){
                return true;
            }else{
                set.add(temp);
                temp = temp.next;
            }
        }
        return false;
    }
}