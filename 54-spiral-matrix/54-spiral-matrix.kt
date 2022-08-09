class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {

        val result = mutableListOf<Int>()
    
        var top = 0
        var left = 0
        var right = matrix[0].size - 1
        var bottom = matrix.size - 1
        var direction = 1
        while (top <= bottom && left <= right) {
            when (direction) {
                1 -> {
                    for (i in left..right) {
                        result.add(matrix[top][i])
                    }
                    ++top
                    direction = 2
                }
                2 -> {
                    for (i in top..bottom) {
                        result.add(matrix[i][right])
                    }
                    --right
                    direction++
                }
                3 -> {
                    for (i in (left..right).reversed()) {
                        result.add(matrix[bottom][i])
                    }
                    --bottom
                    direction++
                }
                4 -> {
                    for (i in (top..bottom).reversed()) {
                        result.add(matrix[i][left])
                    }
                    ++left
                    direction = 1
                }
            }

        }
        return result
    }
}