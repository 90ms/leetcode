class Solution {
    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        for(i in 0 until mat.size) {
            sort(mat, i, 0)
        }
        for(i in 0 until mat[0].size) {
            sort(mat, 0, i)
        }
        return mat
    }
    
    private fun sort(mat: Array<IntArray>, i: Int, j: Int) {
        val m = minOf(mat.size - i, mat[0].size - j)
        val arr = IntArray(m) {
            mat[i+it][j+it]
        }
        arr.sort()
        for(k in arr.indices) {
            mat[i+k][j+k] = arr[k]
        }
    }
}