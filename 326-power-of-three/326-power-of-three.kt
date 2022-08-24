class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        when {
            n == 1 || n == 3 -> return true
            n == 0 || n % 3 !=  0 -> return false
            else -> return isPowerOfThree(n/3)
        }     
    }
}