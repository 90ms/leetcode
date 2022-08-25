class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = magazine.asSequence().groupingBy { it }.eachCount().toMutableMap()
        for (c in ransomNote) {
            val v = map[c] ?: 0
            if (v == 0) return false
            map[c] = v - 1
        }
        return true
    }
}