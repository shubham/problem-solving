fun singleNumber(nums: IntArray): Int {

    var result = nums[0]
    var index = 1
    while (index < nums.size) {
        result = result.xor(nums[index])
        index++
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toIntArray()

    val result = singleNumber(a)

    println(result)
}

