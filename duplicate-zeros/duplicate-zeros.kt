class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        val q: Queue<Int> = LinkedList()

        for (i in arr.indices) {
            q.add(arr[i])
            if (arr[i] == 0) q.add(0)
            arr[i] = q.remove()
        }
    }
}