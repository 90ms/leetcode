/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var stack = Stack<TreeNode>()
        var result = mutableListOf<Int>()
        
        var node = root
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node)
                node = node.left
            }
            node = stack.pop()
            result.add(node.`val`)
            node = node.right
        }
        return result
    }
}