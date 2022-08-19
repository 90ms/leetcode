class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        
        var res: String = s[0].toString()

        for (i in s.indices) {
            res = palindromic(s, res, i, i)
            res = palindromic(s, res, i, i + 1)
        }
        return res        
    }
    
    fun palindromic(
        s: String,
        resInit: String,
        i: Int,
        j: Int
    ): String {
        var res = resInit
        var l = i
        var r = j

        while (l >= 0 && r < s.length && s[l]==s[r]) {
            if (r -l  +1 > res.length)
                res = s.substring(IntRange(l, r))
            l--
            r++
        }
        return res
    }
}