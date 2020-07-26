import java.util.*
import kotlin.math.abs

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    return when {
        abs(x - z) > abs(y - z) -> "Cat B"
        abs(x - z) < abs(y - z) -> "Cat A"
        else -> "Mouse C"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
