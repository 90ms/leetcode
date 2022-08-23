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
    fun isPalindrome(head: ListNode?): Boolean {
        var node = head
        val list = ArrayList<Int>()
        if (head == null) return true
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        for (i in 0..(list.size - 1) / 2) {
            if (list[i] != list[list.size - 1 - i])
                return false
        }
        return true        
    }
}