class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        var n = matrix.size
        var t = 0; var l = 0
        var b = n - 1; var r = n - 1

        while (n > 0) {
            for (i in 0..n - 2) {
                val temp = matrix[t][l + i]
                matrix[t][l + i] = matrix[b - i][l]
                matrix[b - i][l] = matrix[b][r - i]
                matrix[b][r - i] = matrix[t + i][r]
                matrix[t + i][r] = temp
            }
            l++
            t++
            r--
            b--
            n -= 2
    }
    }
}