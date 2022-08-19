class Solution {
    fun isPossible(nums: IntArray): Boolean {
        val listOfStacks: MutableList<Stack<Int>> = mutableListOf()
        for (i in nums.indices) {
            var added = false
            for (j in listOfStacks.size - 1 downTo 0) {
                if (listOfStacks[j].last() + 1 == nums[i]) {
                    listOfStacks[j].add(nums[i])
                    added = true
                    break
                }
            }
            if (added.not()) {
                listOfStacks.apply {
                    add(Stack())
                    last().add(nums[i])
                }
            }
        }
        return listOfStacks.map { it.size }.reduce { runningMin, value -> minOf(runningMin, value) } >= 3
    }
}