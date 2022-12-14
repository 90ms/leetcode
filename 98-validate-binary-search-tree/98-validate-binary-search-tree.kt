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
    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
    
    private fun isValidBST(root: TreeNode?, min: Long, max: Long): Boolean {
        if (root == null) { return true }
        if (root?.`val` >= max || root?.`val` <= min) { return false }
        return isValidBST(root?.left, min, root?.`val`.toLong()) && isValidBST(root?.right,root?.`val`.toLong(), max)
    }

}