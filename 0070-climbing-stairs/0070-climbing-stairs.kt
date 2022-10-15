class Solution {
    fun climbStairs(n: Int) = (1..n).fold(1 to 1) { step, _ ->
        with(step) {
            second to first + second
        }
    }.first
}