class Solution {
    fun strStr(haystack: String, needle: String): Int {
       var i = 0
		while (true) {
			var j = 0
			while (true) {
				if (needle.length == j) return i
				if (i + j >= haystack.length) return -1
				if (haystack[i + j] == needle[j]) j++ else break
			}
			i ++
		} 
    }
}