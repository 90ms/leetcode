class Solution {
    fun plusOne(digits: IntArray) = digits
        .joinToString("")
        .toBigInteger()
        .inc()
        .toString()
        .map(Character::getNumericValue)
        .toIntArray()
}