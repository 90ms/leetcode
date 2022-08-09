class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()

        for (i in nums.indices) {
            result.add(nums[i]*nums[i])
        }
        return result.toIntArray().sortedArray()
    }
}