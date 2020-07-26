import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val scores = maxSubArray(intArrayOf(0))
    print(scores)

}

fun maxSubArray(nums: IntArray): Int {

    var maxSum = Integer.MIN_VALUE
    var max = Integer.MIN_VALUE
    var sum = 0

    var i = 0
    while (i < nums.size) {
        sum += nums[i]

        if (maxSum < sum) {
            maxSum = sum
        }

        if (sum < 0) {
            sum = 0
        }

        if (max < nums[i]) {
            max = nums[i]
        }

        i += 1
//        print("${maxSum}, $max \n")
    }

    return if (maxSum == 0) {
        max
    } else {
        maxSum
    }
}

