import java.util.*


fun digitSquareSum(n: Int): Int {
    var n = n
    var sq = 0
    while (n > 0) {
        val digit = n % 10
        sq += digit * digit
        n /= 10
    }
    return sq
}

fun isHappy(n: Int): Boolean {
    var n = n
    val s = HashSet<Int>()
    s.add(n)

    while (true) {
        if (n == 1)
            return true
        n = digitSquareSum(n)
        if (s.contains(n) && n != s.toTypedArray()[s.size - 1])
            return false
        s.add(n)
    }
}