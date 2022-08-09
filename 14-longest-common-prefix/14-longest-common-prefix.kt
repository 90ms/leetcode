class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]
        
        strs.sort()
        
        for (i in strs[0].indices){
            if (strs[0][i] != strs[strs.size-1][i]) {
                return strs[0].substring(0,i)
            }
        }
        return strs[0]
    }
}