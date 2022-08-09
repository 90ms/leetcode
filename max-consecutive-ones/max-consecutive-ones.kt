class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var current = 0
        var largest = 0
        
        for (i in nums) {
            if (i == 0) {
                current = 0
            } else {
                current++
            }
            if (current > largest) largest = current
        }
        return largest
    } 
}
