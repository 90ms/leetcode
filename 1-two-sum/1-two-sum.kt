class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { i, num ->
            if (map.containsKey(num)) {
                map[num]?.let {
                    return intArrayOf(it, i)
                }
            }
            map[target - num] = i
        }

        return intArrayOf()
    }
}