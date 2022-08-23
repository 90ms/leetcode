class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0        
        for (i in s.lastIndex downTo 0) {
            when {
                s[i] != ' ' -> len++
                len > 0 -> return len
            }
        }
        return len        
    }
}