class Solution {
    fun minSetSize(arr: IntArray): Int {
        val freqCounter = arr.asIterable()
            .groupingBy { it }
            .eachCount()
            .entries
            .sortedWith(Comparator { e1, e2 -> e2.value - e1.value })

        var n = arr.size
        val target = n / 2
        var ans = 0

        for (value in freqCounter.map { it.value }) {
            n -= value
            ans++

            if (n <= target) break
        }
        return ans
    }
}