/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    var numberArray = Array<Int>(100) { 0 }

    var i = 0
    while (i < a.size) {
        ++numberArray[a[i]]
        ++i
    }

    var max = 0
    i = 0
    while (i < numberArray.size - 1) {
        if ((numberArray[i] + numberArray[i + 1]) > max) {
            max = numberArray[i] + numberArray[i + 1]
        }
        ++i
    }

    return max
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
