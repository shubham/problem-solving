class NumOfIdenticalPair {
    fun main(args: Array<String>) {
        val numberOfPair = NumberOfPair()
        println(numberOfPair.numIdenticalPairs(intArrayOf(3, 5, 6, 3, 3, 5)))
    }

    fun numIdenticalPairs(A: IntArray): Int {
        val numMap = HashMap<Int, Int>()
        for (i in A.indices) {
            if (numMap[A[i]] != null)
                numMap[A[i]] = numMap[A[i]]!! + 1
            else numMap[A[i]] =
                1
        }

        var count = 0
        var value: Int
        for (num in numMap.keys) {
            value = numMap[num]!!
            count += value * (value - 1) / 2
        }
        if (count >= 1000000000)
            return 1000000000
        return count
    }
}