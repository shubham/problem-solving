import kotlin.math.max
fun maxSumTwoNoOverlap(A: IntArray, L: Int, M: Int): Int {
    var prefixArr: IntArray = IntArray(A.size)
    var i = 1
    prefixArr[0] = A[0]
    while (i < A.size) {
        prefixArr[i] = A[i] + prefixArr[i - 1]
        i += 1
    }
    var maxSumLtoK = maxArraySum(prefixArr, L, M)
    var maxSumKtoL = maxArraySum(prefixArr, M, L)
    return max(maxSumKtoL, maxSumLtoK)
}

fun maxArraySum(prefixArr: IntArray, start: Int, end: Int): Int {
    var sumStart = subArraySum(prefixArr, 0, start - 1)
    var maxSum = sumStart + subArraySum(prefixArr, start, (start + end - 1))

    var i = start + end - 1
    while (i < prefixArr.size) {
        var sum = subArraySum(prefixArr, (i - start - end + 1), i - end)
        sumStart = max(sum, sumStart)

        var sum2 = sumStart + subArraySum(prefixArr, i - end + 1, i)
        maxSum = max(maxSum, sum2)

        i += 1
    }
    return maxSum
}

fun subArraySum(prefixArr: IntArray, start: Int, end: Int): Int {
    return if (start == 0)
        prefixArr[end]
    else
        prefixArr[end] - prefixArr[start - 1]
}

fun solution(A: IntArray, K: Int, L: Int): Int {
    if (K+L> A.size)
        return -1

    var prefixArr: IntArray = IntArray(A.size)
    var i = 1
    prefixArr[0] = A[0]
    while (i < A.size) {
        prefixArr[i] = A[i] + prefixArr[i - 1]
        i += 1
    }
    var maxSumLtoK = maxArraySum(prefixArr, L, K)
    var maxSumKtoL = maxArraySum(prefixArr, K, L)
    return max(maxSumKtoL, maxSumLtoK)
}