class Solution {
    // fun firstUniqChar(s: String): Int {
    //     var arr = IntArray(26)
    //     for(i in 0 until s.length){
    //         arr[s[i]-'a']++
    //     }
    //     for(i in 0 until s.length){
    //         if(arr[s[i]-'a']==1) return i;
    //     }
    //     return -1
    // }
    
    fun firstUniqChar(s: String) = 
    s.groupingBy { it }
        .eachCount()
        .filterValues { it == 1 }
        .keys
        .firstOrNull()?.let { 
            s.indexOf(it) 
        } 
    ?: -1
}