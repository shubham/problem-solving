import java.util.*
import kotlin.math.abs

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {

    var allMagicSquare = arrayOf(
        intArrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
        intArrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6),
        intArrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
        intArrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8),
        intArrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
        intArrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
        intArrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
        intArrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4)
    )
    var i = 0
    val magicCost = arrayOf(0, 0, 0, 0, 0, 0, 0, 0)
    while (i < allMagicSquare.size) {

        magicCost[i] += abs(allMagicSquare[i][0] - s[0][0]) + abs(allMagicSquare[i][1] - s[0][1]) + abs(
            allMagicSquare[i][2] - s[0][2]
        )
        magicCost[i] += +abs(allMagicSquare[i][3] - s[1][0]) + abs(allMagicSquare[i][4] - s[1][1]) + abs(
            allMagicSquare[i][5] - s[1][2]
        )
        magicCost[i] += +abs(allMagicSquare[i][6] - s[2][0]) + abs(allMagicSquare[i][7] - s[2][1]) + abs(
            allMagicSquare[i][8] - s[2][2]
        )

        ++i
    }

    return magicCost[0]
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}
