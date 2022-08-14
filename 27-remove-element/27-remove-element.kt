class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var size = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[size++] = nums[i]
            }
        }
        return size
    }
}