/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {        
        var result = head
        
        while(result != null && result.next != null) {
            if(result.`val` == result.next.`val`) result.next = result.next.next
            else result = result.next
        }
        
        return head;
    }
}
