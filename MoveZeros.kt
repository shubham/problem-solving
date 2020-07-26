import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    moveZeroes(intArrayOf(0, 1, 0, 3, 12))
}

fun moveZeroes(nums: IntArray): Unit  {
    var i = nums.size - 1
    var lastIndexDigit = nums.size - 1

    while (i >= 0) {
        if (nums[i] == 0 && i != nums.size - 1) {
            var j = i
            while (j < lastIndexDigit) {
                nums[j] = nums[j + 1]
                if (j + 1 == lastIndexDigit) {
                    nums[j + 1] = 0
                    lastIndexDigit = j
                }
                j += 1
            }
        }
        i -= 1
    }
    nums.forEach { print("$it") }
}